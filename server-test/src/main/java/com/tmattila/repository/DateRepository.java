package com.tmattila.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tmattila.model.DateStorageModel;

public interface DateRepository extends MongoRepository<DateStorageModel, Date>{

}
