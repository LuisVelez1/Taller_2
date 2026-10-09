package patrones;

import patrones.servicios.NotificationService;

public class LoggingDecorator implements NotificationService {

    private NotificationService notification;

    public LoggingDecorator(NotificationService notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        System.out.println("[LOG] Enviando notificacion...");
        notification.send(message);
    }
}