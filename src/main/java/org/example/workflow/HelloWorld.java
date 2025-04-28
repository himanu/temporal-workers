package org.example.workflow;


import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface HelloWorld {
    @WorkflowMethod
    String hello(String name);
}
