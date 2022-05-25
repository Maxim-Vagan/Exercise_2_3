package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
	    //Task 1
        System.out.println("Task 1");

        Vehicle[] vehicles = new Vehicle[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        InterfaceForServiceStation station = new ServiceStation();
        for (Vehicle transport : vehicles) {
            station.checkTransport(transport);
        }
    }
}
