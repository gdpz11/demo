package com.example.joole.Repository;

import com.example.joole.Entity.TechnicalDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TechnicalDetailRepository extends JpaRepository<TechnicalDetail,Integer> {

    Optional<TechnicalDetail> findById(long id);

}
