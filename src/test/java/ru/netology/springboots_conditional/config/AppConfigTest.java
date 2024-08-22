package ru.netology.springboots_conditional.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import ru.netology.springboots_conditional.service.SystemProfile;
import ru.netology.springboots_conditional.service.realize.DevProfile;
import ru.netology.springboots_conditional.service.realize.ProductionProfile;

class AppConfigTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Test
    void devProfile_set_true_success() {
        contextRunner.withPropertyValues("netology.profile.dev=true")
                .withUserConfiguration(AppConfig.class)
                .run(context -> {
                    final var actualProfile = context.getBean(SystemProfile.class);
                    Assertions.assertInstanceOf(DevProfile.class, actualProfile);
                });
    }

    @Test
    void prodProfile_default_success() {
        contextRunner
                .withUserConfiguration(AppConfig.class)
                .run(context -> {
                    final var actualProfile = context.getBean(SystemProfile.class);
                    Assertions.assertInstanceOf(ProductionProfile.class, actualProfile);
                });
    }

}