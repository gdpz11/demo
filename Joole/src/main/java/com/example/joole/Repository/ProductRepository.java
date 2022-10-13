package com.example.joole.Repository;

import com.example.joole.Entity.Description;
import com.example.joole.Entity.Product;
import com.example.joole.Entity.ProductType;
import com.example.joole.Entity.TechnicalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<Product> findByTechnicalDetail(TechnicalDetail technicalDetail);

    List<Product> findProductByProductType(ProductType productType);

    List<Product> findProductByBrand();

    List<Product> findProductByDescription(Description description);

    List<Product> findProductByCertification(String certification);



}
