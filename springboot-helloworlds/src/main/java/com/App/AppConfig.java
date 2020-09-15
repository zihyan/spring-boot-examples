package com.App;


import com.App.bean.MyBean;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesScan("com.App.bean")
public class AppConfig {
  @Bean
  public MyBean myBean() {
    return new MyBean();
  }
}


