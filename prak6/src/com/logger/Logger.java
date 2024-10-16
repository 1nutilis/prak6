package com.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Logger {
    private static Logger instance;
    private static final Lock lock = new ReentrantLock();
    private LogLevel logLevel;
    private final String logFilePath;


    private Logger(String logFilePath) {
        this.logFilePath = logFilePath;
        this.logLevel = LogLevel.INFO;
    }


    public static Logger getInstance(String logFilePath) {
        if (instance == null) {
            lock.lock();  // Блокировка для обеспечения потокобезопасности
            try {
                if (instance == null) {
                    instance = new Logger(logFilePath);
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }


    public void setLogLevel(LogLevel level) {
        this.logLevel = level;
    }


    public void log(String message, LogLevel level) {
        if (level.ordinal() >= this.logLevel.ordinal()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(this.logFilePath, true))) {
                writer.println("[" + level + "] " + message);
            } catch (IOException e) {
                System.out.println("Ошибка при записи в лог-файл: " + e.getMessage());
            }
        }
    }
}


