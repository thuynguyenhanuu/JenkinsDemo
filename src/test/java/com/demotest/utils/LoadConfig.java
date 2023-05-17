package com.demotest.utils;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
;
import java.util.concurrent.TimeUnit;

public class LoadConfig {
    private static String BASE_URL = null;


    public static String getURL() {
        return getValueConf(String.valueOf(ThucydidesSystemProperty.WEBDRIVER_BASE_URL));
    }

    public static long getWaitTimeoutInSecond() {
        long millisecond = Long.parseLong(getValueConf(String.valueOf(ThucydidesSystemProperty.WEBDRIVER_WAIT_FOR_TIMEOUT)));
        return TimeUnit.MILLISECONDS.toSeconds(millisecond);
    }
    public static String getValueConf(String config) {
        EnvironmentVariables environmentVariables = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(config);
    }
}
