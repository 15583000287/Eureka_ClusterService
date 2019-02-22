package com.example.eurekaclusterservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterServiceApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入profiles:");
        String profiles = sc.nextLine();
        new SpringApplicationBuilder(EurekaClusterServiceApplication.class).profiles(profiles).run(args);
        //SpringApplication.run(EurekaClusterServiceApplication.class, args);
    }

}
