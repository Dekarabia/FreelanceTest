package ru.Netology.javaqa.HW_CYCLES.services;

public class Freelance {

    public int calculate(int income, int expenses, int threshold, int rest) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        if (money >= threshold) { // можем ли отдыхать?
            count++; // увеличиваем счётчик месяцев отдыха
            money = (money - expenses) / rest;
        } else {
            money = (money + income) - expenses;
        }
        return count;
    }
}

