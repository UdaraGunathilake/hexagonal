package com.baeldung.hexagonal.port.out;

import java.util.List;

import com.baeldung.hexagonal.core.model.Notification;

/**
 * Output port : Repository Interface
 * 
 * @author : Udara Gunathilake
 * @email : udara.dhammika@gmail.com
 * @date : Feb 17, 2020
 */
public interface NotificationRepository {

    void createNotification(Notification notification);

    Notification getNotification(int id);

    List<Notification> getAllNotifications();

}
