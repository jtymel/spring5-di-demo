package guru.springframework.controllers;

import guru.springframework.service.GreetingService;
import guru.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl; // bean name

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
