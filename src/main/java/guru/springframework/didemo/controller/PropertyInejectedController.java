package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInejectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingServiceImpl;

    public String sayHello(){
        return  greetingServiceImpl.sayGreeting();
    }
}
