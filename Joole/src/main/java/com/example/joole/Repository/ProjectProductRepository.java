package com.example.joole.Repository;

import com.example.joole.Entity.ProjectProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProjectProductRepository extends JpaRepository<ProjectProduct,Integer> {

    Optional<ProjectProduct> findById(long id);

}
