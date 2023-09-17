package ru.geekbrains.lesson7.observer;

public class Cleaner implements Observer{
    private String name;

    private int salary = 20000;

    public Cleaner(String name) {
        this.name = name;
    }

    @Override
    public void receiveOfferForIT(String companyName, int salary) {
        System.out.printf("Работник: %s. Я не справлюсь с работой програмиста\n", name);
    }

    @Override
    public void receiveOfferForCleaner(String companyName, int salary) {
        if (this.salary <= salary){
            System.out.printf("Работник: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Работник: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }
}
