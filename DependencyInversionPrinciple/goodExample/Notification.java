package com.fundSOLID.DependencyInversionPrinciple.goodExample;
//This class Notification depends on MessageService and EmailService
class Notification {
    private MessageService messageService;

    // Constructor Dependency Injection
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}
