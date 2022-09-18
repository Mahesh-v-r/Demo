package com.sj.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {

}
