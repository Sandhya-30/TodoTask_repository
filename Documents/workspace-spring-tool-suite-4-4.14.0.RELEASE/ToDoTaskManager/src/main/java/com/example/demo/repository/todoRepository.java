package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Task;
import com.example.demo.entity.TaskDetails;

@Repository
public interface todoRepository extends JpaRepository<Task, Long>{
	Task findByTitle(String tiltle);

	
	
	
}