package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void sendOfferForIT(String companyName, int salary) {
        for (Observer observer: observers) {
            observer.receiveOfferForIT(companyName, salary);
        }
    }

    public void sendOfferForCleaner(String companyName, int salary) {
        for (Observer observer: observers) {
            observer.receiveOfferForCleaner(companyName, salary);
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


}
