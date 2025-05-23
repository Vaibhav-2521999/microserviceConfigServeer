package com.example.demo.scduled;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.util.Cache;
@Component
@EnableScheduling
public class MyScduled
{
	@Autowired
	Cache cache;
	
	
	@Scheduled(fixedDelay = 5,timeUnit = TimeUnit.SECONDS)
public void m1()
{
	cache.clear();
}
}
