package com.epam.zlobin.OpenClose;

public class SmtpMailer {

    private ILogger logger;

    public SmtpMailer(ILogger logger)
    {
        this.logger = logger;
    }
    public void sendMessage(String message)
    {
        logger.Log(message);
    }
}
