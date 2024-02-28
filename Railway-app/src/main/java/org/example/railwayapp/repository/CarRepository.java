package org.example.railwayapp.repository;

import org.example.railwayapp.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
