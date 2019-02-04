package com.epam.zlobin.OpenClose;

public class Logger implements ILogger{

    @Override
    public void Log(String logText) {
        System.out.println(logText + "LOG");
  
        
    }

}
