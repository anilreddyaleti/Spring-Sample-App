/**
 * Copyright info goes here
 */

/**
 * Author: Anil
 * Created: 7/16/2017
 * Last Updated: 7/16/2017
 */

/**
 * purpose of the class goes here
 */

package com.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Training;
import com.training.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {
	
	@Autowired
	private TrainingService trainingService;
	
	/**
	 * 
	 * @return list of training available
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<Training> list() {
		return trainingService.list();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Training getTraining(@PathVariable Long ID) {
		return trainingService.getTraining(ID);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Training add(@RequestBody Training training) {
		return trainingService.add(training);
	}
}
