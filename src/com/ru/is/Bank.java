package com.ru.is;

public class Bank {
    public void sendSms(){
        System.out.println("Отправлено sms сообщение");
    }
    public void sendEmail(){
        sendSms();
        System.out.println("Сообщение отправлено на почту");
    }
    public void sendEmailAndSms(){
         sendEmail();
         sendSms();
    }
}
