package com.marwaalsinawi.PollingApplicationApi.Scheduler;

import com.marwaalsinawi.PollingApplicationApi.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;

public class GeneralScheduler {
    @Autowired
    PollService pollService;
    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String sender;

    @Scheduled(cron = "0 0 * * * *")
    public void sendEmail() {
        try {
            // Creating a simple mail message
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo("marwaalsinawi1997@outlook.com");
            mailMessage.setText("Don't Forget to Vote");
            mailMessage.setSubject("Polling Application ");
            // Sending the mail
            javaMailSender.send(mailMessage);

        } catch (Exception e) {
            // Catch block to handle the exceptions
            e.printStackTrace();

        }
//        return "Mail Sent Successfully...";
    }

}

