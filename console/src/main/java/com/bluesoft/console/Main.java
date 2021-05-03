package com.bluesoft.console;

import com.bluesoft.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j    // lombok annotation
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number Game");
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        context.close();
    }
}
