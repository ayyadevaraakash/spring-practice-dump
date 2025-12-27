package com.tcs.hibernateMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.hibernateMapping.beans.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
