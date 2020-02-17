package com.baeldung.hexagonal.port.in;

import java.util.List;

import com.baeldung.hexagonal.core.model.Notification;

public interface NotificationService {

    void createNotification(Notification notification);
    
    Notification getNotification(int id);
    
    List<Notification> getAllNotifications();	
    
}
