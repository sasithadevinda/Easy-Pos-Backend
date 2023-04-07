package com.bootcamp.robotikka.Robotikkaapi.repo;

import com.bootcamp.robotikka.Robotikkaapi.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface OrdersRepo  extends JpaRepository<Orders,String> {
}
