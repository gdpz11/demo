package com.example.joole.Repository;

import com.example.joole.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {



    public List<ProductType> findProductTypeByType(String type);

    public List<ProductType> findProductTypeByApplication(String application);

    public List<ProductType> findProductTypeByAccessories(String accessories);

    public List<ProductType> findProductTypeByModelYear(Date date);

    List<ProductType> findProductTypeByMountingLocation(String mountingLocation);

}
