package com.example.joole.Repository;

import com.example.joole.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Optional<Product> findById(long id);

}
