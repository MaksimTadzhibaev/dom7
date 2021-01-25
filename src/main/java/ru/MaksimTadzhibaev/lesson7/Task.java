package ru.MaksimTadzhibaev.lesson7;

public class Task {
    public static void main(String[] args) {
        Cat cat[] = new Cat[3];
        cat[0] = new Cat("Вася",30);
        cat[1] = new Cat("Бася", 20);
        cat[2] = new Cat("Тиша", 15);
        Plate plate = new Plate(25);
        plate.info();
            for (Cat i : cat) {
                if (i.getSatiety() == 0) {
                   if (i.getAppetite() > plate.getFood()) {
                       System.out.println("В миске не достаточно корма");
                   }
                   else {
                       i.eat(plate);
                       System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " грамма(ов) корма");
                       i.setSatiety(i.getSatiety() + 1);
                   }
                    i.ate();
                }
            }
            System.out.println("");
        plate.increaseFood();
        plate.info();
    }
}
