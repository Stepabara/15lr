package org.example;

public class Cat implements SoundMaker, Movable, Feedable {
    private String name;
    private String color;
    private double speed;
    private boolean hungry;

    public Cat(String name, String color, double speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.hungry = true;
        this.test3();
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }

    @Override
    public String getSoundType() {
        return "Мяуканье";
    }

    @Override
    public void move() {
        System.out.println(name + " крадётся со скоростью " + speed + " км/ч");
    }
    @Override
    public void test1(){ System.out.println("test1");}
    @Override
    public void test2(){ System.out.println("test2");}

    private void test3(){ System.out.println("test3");}

    public void test1(int f){ System.out.println("test1"+f);}
    public void test1(float f){ System.out.println("test1"+f);}


    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        hungry = false;
        System.out.println(name + " покормлен(а)");
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }

    public void displayInfo() {
        System.out.printf("Кошка: %s, цвет: %s, скорость: %.1f км/ч, голоден: %b%n",
                name, color, speed, hungry);
    }

    public String getName()  { return name; }
    public String getColor() { return color; }
}