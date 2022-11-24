package com.inti.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Reservation;

@Repository
@Transactional
public interface IVoyageurRepository extends JpaRepository<Reservation, Integer> {

}
