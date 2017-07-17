package com.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.TrainingRepository;
import com.training.model.Training;

@Service
public class TrainingService {
	
	@Autowired
	private TrainingRepository trainingRepository;

	public List<Training> list() {
		List<Training> trainingList = new ArrayList<Training>();
		trainingRepository.findAll().forEach(trainingList::add);
		return trainingList;
	}
	
	public Training getTraining(Long id) {
		// ignored exception handling in several places
		return trainingRepository.findOne(id);
	}
	
	public Training add(Training training) {
		return trainingRepository.save(training);
	}
}
