package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>
{

	
	
}
