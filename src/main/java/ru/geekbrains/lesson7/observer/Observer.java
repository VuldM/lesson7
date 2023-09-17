package ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOfferForIT(String companyName, int salary);
    void receiveOfferForCleaner(String companyName, int salary);
}
