package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Train;

public interface TrainRepo extends JpaRepository<Train, Integer> {

}
