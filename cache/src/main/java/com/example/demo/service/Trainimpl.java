package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Train;
import com.example.demo.repository.TrainRepo;
import com.example.demo.util.Cache;

@Service
public class Trainimpl implements TrainService

{
	@Autowired
	
	TrainRepo repo;
	
	@Autowired
	Cache cache;

	@Override
	public void saveTrain(Train train) 
	{
		
	repo.save(train);
		
	}

	@Override
	public Train getTrain(int id)
	{
		if(cache.isAvaiable(id))
		{
			System.out.println("getting data from cache....");
			return cache.getTrain(id);
		} else {
			
			System.out.println("getting data from DB....");
	  Train train = repo.findById(id).get();
			
			
			cache.saveCache(train);
			return train;
		}
		
	}


}
