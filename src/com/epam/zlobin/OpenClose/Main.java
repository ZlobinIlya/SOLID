package com.epam.zlobin.OpenClose;

public class Main {

    public static void main(String[] args) {
        
        ILogger log = new DatabaseLogger();
        
        SmtpMailer ds = new SmtpMailer(log);
        
        ds.sendMessage("Привет ");
        
        
    }

}
