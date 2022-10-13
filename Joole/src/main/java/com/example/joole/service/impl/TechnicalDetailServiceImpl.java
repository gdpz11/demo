package com.example.joole.service.impl;

import com.example.joole.Entity.TechnicalDetail;
import com.example.joole.Repository.TechnicalDetailRepository;
import com.example.joole.service.TechnicalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicalDetailServiceImpl implements TechnicalDetailService {
    @Autowired
    private TechnicalDetailRepository technicalDetailRepository;

    public TechnicalDetail saveTechnicalDetails(TechnicalDetail technicalDetail){
        return technicalDetailRepository.save(technicalDetail);
    }

    public List<TechnicalDetail> getTechnicalDetails(){
        return technicalDetailRepository.findAll();
    }

    public String deleteTechnicalDetails(long id){
        technicalDetailRepository.deleteById(id);
        return "Technical Detail " + id + " has been removed";
    }

}
