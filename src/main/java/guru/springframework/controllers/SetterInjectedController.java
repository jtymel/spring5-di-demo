package guru.springframework.controllers;

import guru.springframework.service.GreetingService;
import guru.springframework.service.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
