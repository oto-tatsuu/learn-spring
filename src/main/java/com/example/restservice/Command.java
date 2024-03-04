package com.example.restservice;

import java.util.Map;

public class Command {
    public Object execute() {
        System.out.println("Command execute!");
        return new Object();
    }

    public void setState(Map commandState) {
    }
}
