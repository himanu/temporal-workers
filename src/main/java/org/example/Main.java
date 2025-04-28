package org.example;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;
import org.example.activity.HelloActivityImpl;
import org.example.workflow.HelloWorldImpl;

public class Main {
    public static void main(String[] args) {
        WorkflowServiceStubs service = WorkflowServiceStubs.newLocalServiceStubs();
        WorkflowClient client = WorkflowClient.newInstance(service);
        WorkerFactory factory = WorkerFactory.newInstance(client);
        Worker worker = factory.newWorker("greetingQueue");

        worker.registerWorkflowImplementationTypes(HelloWorldImpl.class);
//        worker.registerActivitiesImplementations(new HelloActivityImpl());

        factory.start();
    }
}

