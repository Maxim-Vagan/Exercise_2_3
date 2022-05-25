package ru.maxvagan;

public class Car extends Vehicle{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre(int wheelIndex) {
        System.out.println("Меняем покрышку автомобиля на колесе № " + wheelIndex);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
