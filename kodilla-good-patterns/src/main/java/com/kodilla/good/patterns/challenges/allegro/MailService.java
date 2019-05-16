package com.kodilla.good.patterns.challenges.allegro;

public class MailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("Hello, " + user.getName() + " your order will be sent" );

    }
}
