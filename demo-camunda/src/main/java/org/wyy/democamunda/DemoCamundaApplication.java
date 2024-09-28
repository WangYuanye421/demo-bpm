package org.wyy.democamunda;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@EnableProcessApplication
@SpringBootApplication
public class DemoCamundaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCamundaApplication.class, args);
    }

    private RuntimeService runtimeService;


    @EventListener
    public void processPostDeploy(PostDeployEvent event) {
        runtimeService.startProcessInstanceByKey("loanApproval");
        System.out.println("loanApproval process started");
    }

    @Autowired
    public void setRuntimeService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }
}
