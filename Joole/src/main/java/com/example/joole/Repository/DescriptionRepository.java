package com.example.joole.Repository;

import com.example.joole.Entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface DescriptionRepository extends JpaRepository<Description,Integer> {

    Optional<Description> findById(long id);

    List<Description> findDescriptionByManufacturer(String manufacturer);

    List<Description> findDescriptionBySeries(String series);


}
