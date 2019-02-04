package com.epam.zlobin.OpenClose;

public class DatabaseLogger implements ILogger {

    @Override
    public void Log(String logText) {
        System.out.println(logText + "DatebaseLOG");
        
    }

}
