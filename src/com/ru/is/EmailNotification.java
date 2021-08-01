package com.ru.is;

public class EmailNotification implements NotificationSender{
    Bank bank;

    public EmailNotification(Bank bank){
        this.bank = bank;
    }


    @Override
    public void send() {
        bank.sendEmail();

    }
}
