package com.example.joole.Service.Implenemtation;


import com.example.joole.Entity.Product;
import com.example.joole.Entity.Project;
import com.example.joole.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectImp {

    @Autowired
    ProjectRepository projectRepository;

    public Project findOneById(Integer Id) {
        return projectRepository.findById(Id).orElse(null);
    }
}
