package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService  implements  GreetingService{

    @Override
    public String sayGreeting() {
        return "Hellpo I was injected by the construcor";
    }
}
