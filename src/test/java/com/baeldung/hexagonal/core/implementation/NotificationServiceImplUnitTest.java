package com.baeldung.hexagonal.core.implementation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.baeldung.hexagonal.port.out.NotificationRepository;

@RunWith(MockitoJUnitRunner.class)
public class NotificationServiceImplUnitTest {

	@InjectMocks
	private NotificationServiceImpl notificationServiceImpl;

	@Mock
	private NotificationRepository notificationRepository;

	@Test
	public void testCreateNotification() {

		// Mockito.when(notificationRepository.createNotification(Mockito.any(Notification.class))
		// Mockito.when(notificationRepository.createNotification(Mockito.any(Notification.class))).
		// when(notificationRepository.createNotification(Mockito.mock(Notification.class)));

	}

}
