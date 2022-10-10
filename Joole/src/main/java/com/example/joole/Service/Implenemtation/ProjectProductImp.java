package com.example.joole.Service.Implenemtation;


import com.example.joole.Entity.Product;
import com.example.joole.Entity.ProjectProduct;
import com.example.joole.Repository.ProjectProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectProductImp {
    @Autowired
    ProjectProductRepository projectProductRepository;

    public ProjectProduct findOneById(Integer Id) {
        return projectProductRepository.findById(Id).orElse(null);
    }

}
