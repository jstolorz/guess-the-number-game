package com.bluesoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bluesoft")
public class AppConfig {

     @Bean
     public NumberGenerator numberGenerator(){
         return new NumberGeneratorImpl();
     }

     @Bean
    public Game game(){
         return new GameImpl();
     }

     @Bean
    public MessageGenerator messageGenerator(){
         return new MessageGeneratorImpl();
     }
}