package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }
}
