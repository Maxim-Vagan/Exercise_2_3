package ru.maxvagan;

public class ServiceStation implements InterfaceForServiceStation {

    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre(i+1);
            }
            car.checkEngine();
        }
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre(i+1);
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    @Override
    public void check(Bicycle bicycle) {
        if(bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre(i+1);
            }
        }
    }

    public void checkTransport(Vehicle transport) {
        if (transport.getClass().getSimpleName().equals("Car")) this.check((Car) transport);
        else if (transport.getClass().getSimpleName().equals("Truck")) this.check((Truck) transport);
        else if (transport.getClass().getSimpleName().equals("Bicycle")) this.check((Bicycle) transport);
        else System.err.println("Это не транспортное средство");
    }
}