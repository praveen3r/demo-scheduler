package com.demo.job;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.service.UserService;

@Component
public class DemoJob {
	
	@Autowired
	UserService userService;
	
	@Scheduled(cron ="${demo.cron.value}")
	public void execute(){
		try{
		   userService.getUser(BigInteger.ONE);
		}
		catch(Exception e){
		}
	}
	
}
