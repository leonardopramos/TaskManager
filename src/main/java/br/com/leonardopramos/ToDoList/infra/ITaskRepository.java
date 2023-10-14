package br.com.leonardopramos.ToDoList.infra;

import br.com.leonardopramos.ToDoList.Model.TaskModel;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);
}
