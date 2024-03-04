package com.example.restservice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

public abstract class CommandManager {
    protected abstract ExampleBean getBean();
}
