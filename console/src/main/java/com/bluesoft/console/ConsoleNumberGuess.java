package com.bluesoft.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberGuess {
    private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    //1. method parameter is use for spring to check what kind of event we want.
    //2. instead we can add param to @EventListener
    @EventListener(ContextRefreshedEvent.class)
    public void start() {
           log.info("start() Container ready for use.");
    }
}
