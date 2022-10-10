package com.example.joole.Service.Implenemtation;


import com.example.joole.Entity.Product;
import com.example.joole.Entity.ProductType;
import com.example.joole.Repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeImp {

    @Autowired
    ProductTypeRepository productTypeRepository;

    public ProductType findOneById(Integer Id) {
        return productTypeRepository.findById(Id).orElse(null);
    }
}
