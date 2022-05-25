package ru.maxvagan;

public class Truck extends Vehicle{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre(int wheelIndex) {
        System.out.println("Меняем покрышку грузовика на колесе № " + wheelIndex);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
