package br.com.leonardopramos.ToDoList.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@Entity(name = "Tasks")
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {
    @Id@GeneratedValue(generator = "UUID")
    private UUID id;
    private UUID idUser;
    private String desc;
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private int priority;
    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception{
        if(title.length() > 50){
            throw new Exception("Título ultrapassou o limite de caracteres");
        }
        this.title = title;
    }
}
