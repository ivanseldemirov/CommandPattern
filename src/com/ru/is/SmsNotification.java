package com.ru.is;

public class SmsNotification implements NotificationSender{
    Bank bank;

    public SmsNotification(Bank bank){
        this.bank = bank;
    }
    @Override
    public void send() {
        bank.sendSms();
    }
}
