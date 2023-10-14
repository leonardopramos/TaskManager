package br.com.leonardopramos.ToDoList.infra;

import br.com.leonardopramos.ToDoList.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    public UserModel findByUsername(String username);
}
