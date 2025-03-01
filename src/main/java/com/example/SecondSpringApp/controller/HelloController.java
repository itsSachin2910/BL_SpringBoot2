package com.example.SecondSpringApp.controller;

import com.example.SecondSpringApp.Model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Message sayHello() {
        logger.info("Received request at /api/hello");

        Message message = new Message("Hello from BridgeLabz");

        logger.debug("Returning message: {}", message.getText());
        return message;
    }
}
