package org.camargovf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WorkerMainApp {
    public static void main(String[] args) {
        System.out.println("WorkerMainApp Online");
    }
}