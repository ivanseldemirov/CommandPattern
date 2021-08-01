package com.ru.is;

import java.util.Scanner;

public class NotificationSenderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, выберите способ отправки уведомлений:");
        System.out.println("1 - по sms");
        System.out.println("2 - по e-mail");
        System.out.println("3 - по sms и e-mail");

        int optionNumber = scanner.nextInt();

        Bank bank = new Bank();
        SmsNotification smsNotification = new SmsNotification(bank);
        EmailNotification emailNotification = new EmailNotification(bank);
        SmsAndEmailNotification smsAndEmailNotification = new SmsAndEmailNotification(bank);

        if(optionNumber == 1){
            System.out.println("Вы выбрали отпраку по sms");
            NotificationInvoker notificationInvoker = new NotificationInvoker(smsNotification);
            notificationInvoker.send();
        }

        if(optionNumber == 2){
            System.out.println("Вы выбрали отправку по email");
            NotificationInvoker notificationInvoker = new NotificationInvoker(emailNotification);
            notificationInvoker.send();
        }

        if(optionNumber == 3){
            System.out.println("Вы выбрали отпраку по sms и email");
            NotificationInvoker notificationInvoker = new NotificationInvoker(smsAndEmailNotification);
            notificationInvoker.send();
        }
    }
}
