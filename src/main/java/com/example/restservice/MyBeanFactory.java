package com.example.restservice;

public class MyBeanFactory {
    public static MyBean createInstance() {
        System.out.println("create Instance");
        return new MyBean();
    }

//    public static ExampleBean createExBean(int years,String ultimateAnswer) {
//        System.out.println(years + "," +  ultimateAnswer);
//        return new ExampleBean(years, ultimateAnswer);
//    }
}
