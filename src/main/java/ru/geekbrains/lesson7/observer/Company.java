package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOfferForIT(name, salary);
    }
    public void needCleaner(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOfferForCleaner(name, salary);
    }

}
