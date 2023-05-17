package com.demotest.utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logging {
    public static Logger logs = Logger.getLogger(Logging.class);

    private Logging() {
        BasicConfigurator.configure();
    }

    public static void debug(String msg) {
        logs.debug(">> Debug: | " + msg);
        System.out.println(">> Debug: | " + msg);
    }

    public static void info(String msg) {
        logs.info(">> Info: | " + msg);
        System.out.println(">> Info: | " + msg);
    }

    public static void warn(String msg) {
        logs.warn(">> Warn: | " + msg);
        System.out.println(">> Warn: |" + msg);
    }

    public static void error(String msg) {
        logs.error(">> Error: | " + msg);
        System.err.println(">> Error: |" + msg);
    }
}