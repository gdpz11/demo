package com.example.joole.Service.Implenemtation;


import com.example.joole.Entity.Description;
import com.example.joole.Repository.DescriptionRepository;
import com.example.joole.Service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescriptionImp implements DescriptionService {

    @Autowired
    DescriptionRepository descriptionRepository;

    public Description saveDescription(Description description){
        return descriptionRepository.save(description);
    }

    public List<Description> getProducts(){
        return descriptionRepository.findAll();
    }

    public String deleteProduct(Integer id){
        descriptionRepository.deleteById(id);
        return "DescriptionService " + id + " has been removed";
    }

}
