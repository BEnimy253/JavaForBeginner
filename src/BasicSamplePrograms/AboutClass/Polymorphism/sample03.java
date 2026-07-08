package BasicSamplePrograms.AboutClass.Polymorphism;

public class sample03 {
    interface Notification {
        void send(String message);
    }

    static class EmailNotification implements Notification {
        @Override
        public void send(String message) {
            System.out.println("Gui email: " + message);
        }
    }

    static class SmsNotification implements Notification {
        @Override
        public void send(String message) {
            System.out.println("Gui SMS: " + message);
        }
    }

    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification(),
                new SmsNotification()
        };

        for (Notification notification : notifications) {
            notification.send("Chao mung den voi Java!");
        }
    }
}
