package com.example.joole.service;

import com.example.joole.Entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findProjectsByUserName(String name);

    Project saveProject(Project project);

    Project findProjectById(Long id);

    String deleteProject(long id);

    List<Project> getProject();
}
