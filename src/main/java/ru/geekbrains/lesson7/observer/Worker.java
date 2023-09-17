package ru.geekbrains.lesson7.observer;

public class Worker implements Observer {

    private String name;

    private int salary = 80000;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void receiveOfferForIT(String companyName, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист: %s: Мне нужна работа програмиста! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Специалист: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }


    @Override
    public void receiveOfferForCleaner(String companyName, int salary) {
        System.out.printf("Специалист: %s.  Мне не нужна работа уборщика\n", name);
    }
}
