package ru.geekbrains.lesson7.observer;

public interface Publisher {

    void sendOfferForIT(String companyName, int salary);
    void sendOfferForCleaner(String companyName, int salary);

    void registerObserver(Observer observer);



}
