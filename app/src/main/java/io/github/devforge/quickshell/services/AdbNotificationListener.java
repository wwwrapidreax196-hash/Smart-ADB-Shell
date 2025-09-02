package io.github.devforge.quickshell.services;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

public class AdbNotificationListener extends NotificationListenerService {

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        // TODO: We will add code here to read the notification
        super.onNotificationPosted(sbn);
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        super.onNotificationRemoved(sbn);
    }
}