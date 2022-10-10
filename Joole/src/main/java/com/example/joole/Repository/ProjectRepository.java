package com.example.joole.Repository;

import com.example.joole.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {

    Optional<Project> findById(long id);

}
