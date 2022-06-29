package com.company;

public class Vehicle {


    void steering () {
        System.out.println("Steering wheel can be moved in any direction");

    }
    void drive () {
        System.out.println("Vehicle is moving");
    }

    static class Car extends Vehicle {
        boolean haveManualGearBox;

        public Car(boolean haveManualGearBox) {
            this.haveManualGearBox = haveManualGearBox;
        }

        @Override
        void steering() {
            System.out.println("Steering wheel can only spin");
        }
        void drive () {
            System.out.println("Car can be moved only along the road");
        }

        void gearChange() {
            if(haveManualGearBox) System.out.println("Gear change should be performed manually");
            else System.out.println("Gear change is performed automatically");
        }
    }

    static class SportCar extends Car {
        public SportCar() {
            super(true);
        }
        void drive() {
            System.out.println("Sport Car can be moved along the road either along sport track");
        }

    }

    public static void main(String[] args) {
        SportCar ferrari = new SportCar();
        ferrari.steering();
        ferrari.drive();
        ferrari.gearChange();

        Car car = new Car(false);
        car.drive();
        car.gearChange();

        Vehicle car1 = new Vehicle();
        car1.drive();
        car1.steering();
    }
}
