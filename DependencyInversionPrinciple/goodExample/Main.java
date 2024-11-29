package com.fundSOLID.DependencyInversionPrinciple.goodExample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection
        MessageService emailService = new EmailService(); //objects are created outside Notification class, Notification depends on the EmailService class
        Notification emailNotification = new Notification(emailService);
        emailNotification.notifyUser("Hello via Email!");

        MessageService smsService = new SMSService(); //objects are created outside Notification class, Notification depends on the SMSService class
        Notification smsNotification = new Notification(smsService);
        smsNotification.notifyUser("Hello via SMS!");

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
    }
}
