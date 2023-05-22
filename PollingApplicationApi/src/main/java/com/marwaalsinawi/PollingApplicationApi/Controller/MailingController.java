package com.marwaalsinawi.PollingApplicationApi.Controller;

import com.marwaalsinawi.PollingApplicationApi.Models.EmailDetails;
import com.marwaalsinawi.PollingApplicationApi.Service.MailingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="email")
public class MailingController {
    @Autowired
    MailingService maillingService;


    @PostMapping(value = "sendSimpleMail")                                                   //send Simple Mail
    public String sendSimpleMail(@RequestBody EmailDetails emailDetails){
        String mail=maillingService.sendSimpleMail(emailDetails);
        return  mail;
    }
}
