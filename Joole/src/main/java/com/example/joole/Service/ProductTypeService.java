package com.example.joole.Service;

import com.example.joole.Entity.Product;
import com.example.joole.Entity.ProductType;

import java.util.Date;
import java.util.List;

public interface ProductTypeService {

    public ProductType findById(Integer id);

    List<ProductType> findAll();

    //public ProductType save(ProductType productType);

    public List<ProductType> findByType(String type);

    public List<Product> findByApplication(String application);

    public List<Product> findByYear(Date date);
}
