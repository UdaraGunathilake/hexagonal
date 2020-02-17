package com.baeldung.hexagonal.adapter.out;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.baeldung.hexagonal.core.model.Notification;
import com.baeldung.hexagonal.port.out.NotificationRepository;

/**
 * Output adapter : Implementation of Repository
 * 
 * @author : Udara Gunathilake
 * @email : udara.dhammika@gmail.com
 * @date : Feb 17, 2020
 */
@Repository
public class NotificationRepositoryImplementation implements NotificationRepository {

    protected static Map<Integer, Notification> notificatonList = new HashMap<>();

    @Override
    public void createNotification(Notification notification) {
	notificatonList.put(notification.getId(), notification);

    }

    @Override
    public Notification getNotification(int id) {

	return notificatonList.get(id);
    }

    @Override
    public List<Notification> getAllNotifications() {

	return notificatonList.values().stream().collect(Collectors.toList());
    }

}
