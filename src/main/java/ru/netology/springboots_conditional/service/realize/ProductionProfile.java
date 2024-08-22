package ru.netology.springboots_conditional.service.realize;

import ru.netology.springboots_conditional.service.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}

