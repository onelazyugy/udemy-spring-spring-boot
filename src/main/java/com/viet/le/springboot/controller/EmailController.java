package com.viet.le.springboot.controller;

import com.viet.le.springboot.service.EmailService;
import org.hibernate.validator.constraints.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * Created by VTL on 2/25/18.
 */
@RestController
@RequestMapping(path = "/email")
public class EmailController {
    private static final Logger LOG = LoggerFactory.getLogger(EmailController.class);
    @Autowired
    private EmailService emailService;

    @RequestMapping(path = "/{emailAddress}")
    public void sendEmail(@PathVariable(name = "emailAddress") String emailAddress) {
        try {
            emailService.sendEmail(emailAddress, "test spring email", "spring email works great");
        }catch (MessagingException me) {
            LOG.error("Send email error:" + me.getMessage());
        }
    }
}
