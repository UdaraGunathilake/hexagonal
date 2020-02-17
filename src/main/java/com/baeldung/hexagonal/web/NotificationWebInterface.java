package com.baeldung.hexagonal.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.baeldung.hexagonal.core.model.Notification;

public interface NotificationWebInterface {

    @PostMapping
    void createNotification(@RequestBody Notification notification);

    @GetMapping("/{id}")
    public Notification getNotification(@PathVariable int id);	

    @GetMapping
    public List<Notification> getAllNotifications();
}
