package com.example.joole.Service.Implenemtation;


import com.example.joole.Entity.Product;
import com.example.joole.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImp {

    @Autowired
    ProductRepository productRepository;


    public Product findOneById(Integer Id) {
        return productRepository.findById(Id).orElse(null);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);

    }
}
