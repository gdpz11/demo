package com.example.joole.Repository;

import com.example.joole.Entity.Product;
import com.example.joole.Entity.Project;
import com.example.joole.Entity.ProjectProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectProductRepository extends JpaRepository<ProjectProduct,Long> {

    List<ProjectProduct> findProjectProductByProject(Project project);

    List<ProjectProduct> findProjectProductByProduct(Product product);

}
