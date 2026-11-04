package org.example;

public interface Feedable {
    void feed();
    boolean isHungry();
    public static final int a = 54;
    abstract void test1();
    default void test2(){}
    private void test3(){}

}