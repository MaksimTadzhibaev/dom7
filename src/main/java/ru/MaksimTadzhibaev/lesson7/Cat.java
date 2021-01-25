package ru.MaksimTadzhibaev.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
    }

    public void eat(Plate d) {
        d.decreaseFood(appetite);
    }

    public void ate() {
        if (satiety == 0) {
            System.out.println("Кот " + getName() + " голоден");
        }
        else {System.out.println("Кот " + getName()+ " наелся");}
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite (int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
}
