package org.example.workflow;

import io.temporal.workflow.Workflow;
import org.example.activity.HelloActivity;

public class HelloWorldImpl implements HelloWorld{
//    public final HelloActivity activity = Workflow.newActivityStub(HelloActivity.class);

    @Override
    public String hello(String name) {
        return "activity.hello(name)";
    }
}
