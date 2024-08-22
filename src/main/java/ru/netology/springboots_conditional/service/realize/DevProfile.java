package ru.netology.springboots_conditional.service.realize;

import ru.netology.springboots_conditional.service.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
