package org.example;

public class Dog implements SoundMaker, Movable, Feedable {
    private String name;
    private String breed;
    private double speed;
    private boolean hungry;

    public Dog(String name, String breed, double speed) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
        this.hungry = true;
    }

    public void test1(){ System.out.println("test11");}

    public void test2(){ System.out.println("test22");}

    private void test3(){ System.out.println("test33");}



    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав-гав!");
    }

    @Override
    public String getSoundType() {
        return "Лай";
    }

    @Override
    public void move() {
        System.out.println(name + " бегает на четырёх лапах со скоростью " + speed + " км/ч");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        hungry = false;
        System.out.println(name + " покормлен");
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }

    public void displayInfo() {
        System.out.printf("Собака: %s, порода: %s, скорость: %.1f км/ч, голоден: %b%n",
                name, breed, speed, hungry);
    }

    public String getName()  { return name; }
    public String getBreed() { return breed; }
}