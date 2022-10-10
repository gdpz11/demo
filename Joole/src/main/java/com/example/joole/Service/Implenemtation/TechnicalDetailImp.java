package com.example.joole.Service.Implenemtation;


import com.example.joole.Entity.Product;
import com.example.joole.Entity.TechnicalDetail;
import com.example.joole.Repository.TechnicalDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicalDetailImp {
    @Autowired
    TechnicalDetailRepository technicalDetailRepository;

    public TechnicalDetail findOneById(Integer Id) {
        return technicalDetailRepository.findById(Id).orElse(null);
    }
}
