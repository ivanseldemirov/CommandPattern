package com.ru.is;

public class NotificationInvoker {
    public NotificationSender notificationSender;
    public NotificationInvoker(NotificationSender notificationSender){
        this.notificationSender = notificationSender;
    }
    public void send(){
        this.notificationSender.send();
    }
}
