package com.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.model.Training;

public interface TrainingRepository extends CrudRepository<Training, Long> {

}
