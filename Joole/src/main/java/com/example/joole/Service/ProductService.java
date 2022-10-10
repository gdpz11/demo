package com.example.joole.Service;

import com.example.joole.Entity.Product;
import com.example.joole.Entity.ProductType;

import java.util.List;

public interface ProductService {

    public Product findById(Integer id);

    List<Product> findAll();

    //public Product save(Product product);

    public List<Product> findByProductType(ProductType productType);

    public List<Product> findByBrand(String brand);

}
