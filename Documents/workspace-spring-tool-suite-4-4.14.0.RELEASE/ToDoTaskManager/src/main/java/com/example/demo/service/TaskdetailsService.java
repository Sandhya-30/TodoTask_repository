package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskDetails;
import com.example.demo.repository.TaskDetailsRepo;

@Service
public class TaskdetailsService {

	@Autowired
	TaskDetailsRepo Repo;
	
	public TaskDetails saveTask(TaskDetails taskdetails) {
		// TODO Auto-generated method stub
		return Repo.save(taskdetails);
	}

	
}
