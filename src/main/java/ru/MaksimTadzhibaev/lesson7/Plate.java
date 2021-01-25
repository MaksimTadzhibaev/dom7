package ru.MaksimTadzhibaev.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
            food -= n;
    }

    void increaseFood() {
        this.food += 50;
        System.out.println("В миску добавили 50 грамм(ов) корма");
    }

    public void info() {
        System.out.println("В миске " + food + " грамм корма\n");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
