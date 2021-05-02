package com.bluesoft.config;

import com.bluesoft.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "com.bluesoft")
public class AppConfig {


    @Bean
    public Game game(){
         return new GameImpl();
     }

     @Bean
    public MessageGenerator messageGenerator(){
         return new MessageGeneratorImpl();
     }
}
