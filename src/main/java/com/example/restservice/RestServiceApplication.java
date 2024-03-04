package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        // SpringApplication.run(RestServiceApplication.class, args);
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        CommandManager bean = (CommandManager) context.getBean("cm");
        System.out.println(context.getBean("cm"));
        ApplicationContext context2 = new ClassPathXmlApplicationContext("services.xml");
        System.out.println(context2.getBean("cm"));
    }

}