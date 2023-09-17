package ru.geekbrains.lesson7.observer;

public class Student implements Observer {

    private String name;

    private int salary = 10000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOfferForIT(String companyName, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент: %s: Мне нужна работа програмиста! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }

    @Override
    public void receiveOfferForCleaner(String companyName, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент: %s: За эти денги я могу проработать уборщиком! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }
}
