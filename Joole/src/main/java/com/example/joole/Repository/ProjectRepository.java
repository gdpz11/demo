package com.example.joole.Repository;

import com.example.joole.Entity.Project;
import com.example.joole.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    List<Project> findAllByUser(User user);

}
