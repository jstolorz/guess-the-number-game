package com.bluesoft.config;

import com.bluesoft.GuessCount;
import com.bluesoft.MaxNumber;
import com.bluesoft.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bluesoft")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

  @Value("${game.maxNumber:20}")
  private int maxNumber;

  @Value("${game.minNumber:0}")
  private int minNumber;

  @Value("${game.guessCount:5}")
  private int guessCount;

  @Bean
  @MaxNumber
  public int maxNumber(){
      return maxNumber;
  }

  @Bean
  @MinNumber
  public int minNumber(){
    return minNumber;
  }

  @Bean
  @GuessCount
  public int guessCount() {
      return guessCount;
  }
}
