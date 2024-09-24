package com.testwebsite.testwebsite;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public WelcomeMessage()
    {

    }
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot!";
    }
}
