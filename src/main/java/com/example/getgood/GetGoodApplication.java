package com.example.getgood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

@SpringBootApplication
public class GetGoodApplication {


    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = SpringApplication.run(GetGoodApplication.class, args)){
           Scanner scanner = new Scanner(System.in);
        boolean running = true;
            while(running){
                String input = scanner.nextLine();
                if(input.equals("exit")){
                    running = false;
                }
                context.start();
            }


        } catch (Exception e) {
        System.err.println( e.getMessage());
            System.out.println("Something went wrong starting application");
        }
        }
}
