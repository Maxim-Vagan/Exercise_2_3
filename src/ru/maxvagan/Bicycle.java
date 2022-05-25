package ru.maxvagan;

public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre(int wheelIndex) {
        System.out.println("Меняем покрышку велосипеда на колесе № " + wheelIndex);
    }
}
