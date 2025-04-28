package org.example.workflow;

public class HelloWorld1Impl implements HelloWorld1 {
    @Override
    public String hello(String name) {
        return "Bye " + name;
    }
}
