package org.example.activity;

public class HelloActivityImpl implements HelloActivity{
    @Override
    public String hello(String name){
        return "Hello " + name;
    }
}
