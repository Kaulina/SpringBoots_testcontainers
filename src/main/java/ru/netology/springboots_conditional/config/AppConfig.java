package ru.netology.springboots_conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.servlet.ConditionalOnMissingFilterBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springboots_conditional.service.realize.DevProfile;
import ru.netology.springboots_conditional.service.realize.ProductionProfile;
import ru.netology.springboots_conditional.service.SystemProfile;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnMissingFilterBean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
