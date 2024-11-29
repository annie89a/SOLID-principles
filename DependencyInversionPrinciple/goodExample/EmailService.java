package com.fundSOLID.DependencyInversionPrinciple.goodExample;

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

