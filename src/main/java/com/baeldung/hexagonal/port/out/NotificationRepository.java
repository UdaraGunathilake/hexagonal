package com.baeldung.hexagonal.port.out;

import java.util.List;

import com.baeldung.hexagonal.core.model.Notification;

public interface NotificationRepository {

    void createNotification(Notification notification);

    Notification getNotification(int id);

    List<Notification> getAllNotifications();

}
