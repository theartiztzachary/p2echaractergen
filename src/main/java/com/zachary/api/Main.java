package com.zachary.api;

import io.javalin.Javalin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Application starting...");
        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });

        //create controller objects

        //create api routes

        app.start();
        logger.info("Application started successfully.");
    }
}
