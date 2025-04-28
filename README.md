# Temporal Worker
It contains worklow and activity definition.

# How to use
1. Start this project in local
2. Start temporal server
3. Intiate workflow request from either
   a. CLI
   b. Client App


**CLI**
```
temporal workflow start \
  --task-queue greetingQueue \
  --type HelloWorld \
  --workflow-id hello-workflow-457 \
  --input '"World"'
```
**Workflow UI**
http://localhost:8080/namespaces/default/workflows
