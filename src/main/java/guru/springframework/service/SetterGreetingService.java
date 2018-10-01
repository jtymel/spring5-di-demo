package guru.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi, I was injected by the setter";
    }
}
