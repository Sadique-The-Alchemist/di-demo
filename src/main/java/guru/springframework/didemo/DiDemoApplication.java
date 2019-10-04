package guru.springframework.didemo;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.controller.MyController;
import guru.springframework.didemo.controller.PropertyInejectedController;
import guru.springframework.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
      ApplicationContext ctx= SpringApplication.run(DiDemoApplication.class, args);
        MyController controller=(MyController)ctx.getBean("myController");
        controller.hello();
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInejectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayGreeting());
    }

}
