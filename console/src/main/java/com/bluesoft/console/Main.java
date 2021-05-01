package com.bluesoft.console;

import com.bluesoft.config.AppConfig;
import com.bluesoft.Game;
import com.bluesoft.MessageGenerator;
import com.bluesoft.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Guess The Number Game");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NumberGenerator generator = context.getBean(NumberGenerator.class);
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info(messageGenerator.getMainMessage());
        log.info(messageGenerator.getResultMessage());

        int number = generator.next();

        log.info("Number = {}",number);

        Game game = context.getBean(Game.class);

        context.close();
    }
}
