package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {
        SoundMaker[] animals = new SoundMaker[5];

        animals[0] = new Dog("Шарик",  "Овчарка",      30);
        animals[1] = new Dog("Бобик",  "Лабрадор",     25);
        animals[2] = new Dog("Рекс",   "Доберман",     35);
        animals[3] = new Cat("Мурка",  "Серый",        15);
        animals[4] = new Cat("Барсик", "Рыжий",        18);

        System.out.println("\nЗвуки");
        for (SoundMaker sm : animals) {
            sm.makeSound();
            System.out.println("  тип звука: " + sm.getSoundType());
        }

        System.out.println("\nДвижение");
        for (SoundMaker sm : animals) {
            if (sm instanceof Movable) {
                Movable m = (Movable) sm;
                m.move();
                System.out.println("  скорость: " + m.getSpeed() + " км/ч");
            }
        }

        System.out.println("\nКормление");
        for (SoundMaker sm : animals) {
            if (sm instanceof Feedable) {
                Feedable f = (Feedable) sm;
                System.out.println("Голоден до кормления? " + f.isHungry());
                f.feed();
                f.test1();
                f.test2();
                System.out.println("Голоден после? " + f.isHungry());
            }
        }

        System.out.println("\n--- Информация о каждом ---");
        for (SoundMaker sm : animals) {
            if (sm instanceof Dog) {
                ((Dog) sm).displayInfo();
            } else if (sm instanceof Cat) {
                ((Cat) sm).displayInfo();
            }
        }


    }
}