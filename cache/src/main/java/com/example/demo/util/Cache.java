package com.example.demo.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Train;
import com.example.demo.repository.TrainRepo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Cache 
{
	Map<Integer,Train> m=new HashMap();
	
@Autowired
TrainRepo repo;
	
	public void saveCache(Train train)
	{
	m.put(train.getId(), train);
		
	}
	public Train getTrain(int id)
	{
	return	m.get(id);
	}
	
	public Boolean isAvaiable(int id)
	{
		return m.containsKey(id);
	}
	@PostConstruct
	public void dumpAllDataintoCache()
	{
		
		System.out.println("inserting all data into cache....");
		List<Train> all = repo.findAll();
		all.forEach((train)->m.put(train.getId(), train));
		
//		for(Train t:all)
//		{
//			m.put(t.getId(), t);
//		}
	}
	@PreDestroy
	public void clear()
	{System.out.println("clearing data after 5 second...");
		m.clear();
	}
	
}
