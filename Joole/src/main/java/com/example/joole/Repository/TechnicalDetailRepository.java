package com.example.joole.Repository;

import com.example.joole.Entity.TechnicalDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface TechnicalDetailRepository extends JpaRepository<TechnicalDetail,Long> {
    //airflow,power,operatingvoltage,fanspeed

    List<TechnicalDetail> findTechnicalDetailByAirflow(Integer airflow);

    List<TechnicalDetail> findTechnicalDetailByPower(Integer power); // can add some restrictions like more than..

    List<TechnicalDetail> findTechnicalDetailByVoltage(Integer operatingVoltage);

    List<TechnicalDetail> findTechnicalDetailByFanSpeed(Integer fanSpeed);


}
