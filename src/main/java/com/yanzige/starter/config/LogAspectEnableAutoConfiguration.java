package com.yanzige.starter.config;

import com.yanzige.starter.aspectj.LogAspect;
import com.yanzige.starter.prop.LogProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LogProperties.class)
@ConditionalOnProperty(name = "mvc.log.enabled", matchIfMissing = true)
@ComponentScan("com.yanzige.starter")
public class LogAspectEnableAutoConfiguration {

    @Bean
    public LogProperties logProperties() {
        return new LogProperties();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
