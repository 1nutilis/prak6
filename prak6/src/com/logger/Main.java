package com.logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance("application.log");


        logger.setLogLevel(LogLevel.WARNING);


        Thread thread1 = new Thread(() -> logger.log("Это информационное сообщение", LogLevel.INFO));
        Thread thread2 = new Thread(() -> logger.log("Это предупреждение", LogLevel.WARNING));
        Thread thread3 = new Thread(() -> logger.log("Это ошибка", LogLevel.ERROR));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
