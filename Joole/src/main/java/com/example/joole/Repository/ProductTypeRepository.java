package com.example.joole.Repository;

import com.example.joole.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {

    Optional<ProductType> findById(long id);

}
