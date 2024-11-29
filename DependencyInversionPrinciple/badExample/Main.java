package com.fundSOLID.DependencyInversionPrinciple.badExample;
//Note: in this example, the Notification class is tightly coupled to the EmailService class.
// lets say if we want to add new Services in future, this makes it difficult to extend.
//this also makes it difficult to write unit testing as well.

//solution: make it more generic by introducing interfaces (Abstraction), where dependency objects are created outside and injected
class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class Notification {
    private EmailService emailService;

    public Notification() {
        this.emailService = new EmailService(); // Direct dependency
    }

    public void notifyUser(String message) {
        emailService.sendEmail(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.notifyUser("Hello, World!");
    }
}
