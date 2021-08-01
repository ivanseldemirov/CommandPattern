package com.ru.is;

public class SmsAndEmailNotification implements NotificationSender{
    Bank bank;
    public SmsAndEmailNotification(Bank bank){
        this.bank = bank;
    }
    @Override
    public void send() {
        bank.sendEmailAndSms();
    }
}
