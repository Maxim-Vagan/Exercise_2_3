package ru.maxvagan;

public interface InterfaceForServiceStation {
    void check(Car car);
    void check(Bicycle bicycle);
    void check(Truck truck);
    void checkTransport(Vehicle transport);
}
