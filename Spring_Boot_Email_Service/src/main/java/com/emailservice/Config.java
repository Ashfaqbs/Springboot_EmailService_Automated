package com.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.emailservice.service.EmailSenderService;

import jakarta.mail.MessagingException;

@Configuration
@EnableScheduling
public class Config {
	
	@Autowired
	EmailSenderService service ;

//	@Scheduled(cron = "* * * * * *")
	@Scheduled(cron = "0 * * * * *")
	public void scheduledTask() throws MessagingException {
		String []to= {"ashfaq786786.wwe@gmail.com","ashfaqhacker00@gmail.com" ,"aftabbs.wwe@gmail.com"};
		String []bcc= {"bantg95@gmail.com"};
		String []cc= {"hnsati365@gmail.com","harshipro776@gmail.com" };
		this.service.sendMailWithAttachMent(to, cc, bcc, "This is a body ", "Mail testing is the Subject", "C:\\Users\\Ashfaq PC\\Downloads\\file.txt");
	
	
		System.out.println("Working ");
	}

	
}
