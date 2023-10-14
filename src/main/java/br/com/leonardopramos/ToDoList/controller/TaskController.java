package br.com.leonardopramos.ToDoList.controller;

import br.com.leonardopramos.ToDoList.Model.TaskModel;
import br.com.leonardopramos.ToDoList.infra.ITaskRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.leonardopramos.ToDoList.infra.Utils.Util;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @Autowired
    ITaskRepository repository;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody TaskModel taskModel, HttpServletRequest request){
        taskModel.setIdUser((UUID) request.getAttribute("idUser"));

        var currentDate = LocalDateTime.now();
        if(currentDate.isAfter(taskModel.getStartAt()) || currentDate.isAfter(taskModel.getEndAt())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Data inválida, verifique se a data já não passou.");
        }
        if(taskModel.getStartAt().isAfter(taskModel.getEndAt())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Data inválida");
        }
        var task = repository.save(taskModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }
    @GetMapping("/all")
    public List<TaskModel> findAll(HttpServletRequest request){
        return repository.findByIdUser((UUID)request.getAttribute("idUser"));

    }
    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody TaskModel taskModel,@PathVariable UUID id, HttpServletRequest request){

        var task = repository.findById(id).orElse(null);

        if(task == null){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Task inexistente!");

        }
        if(!task.getIdUser().equals(request.getAttribute("idUser"))){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário não tem permissão para alterar esta Task!");
        }
        Util.copyNonNullProperties(taskModel,task);

        repository.save(task);
        return ResponseEntity.status(HttpStatus.OK).body(task);

    }
}
