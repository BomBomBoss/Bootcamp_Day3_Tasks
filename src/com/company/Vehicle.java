package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Vehicle {


    void steering () {
        System.out.println("We can move steering wheel in any direction!!!");

    }
    void drive () {
        System.out.println("Vehicle is moving, or flying or sailing. Who knows...");
    }

    static class Car extends Vehicle {
        int [] gearSpeed;
        private boolean isSpeedIncreased;
        private boolean isStraightMoving;
        int currentGearSpeed;

        public void setSpeedIncrease(boolean speedIncreased) {
            isSpeedIncreased = speedIncreased;
            if(speedIncreased=true) {
                isStraightMoving = true;
            } else { isStraightMoving = false;
            }
        }


        public void moveForward(boolean yes) {
            if(yes==true){
                isStraightMoving=true;
                isSpeedIncreased =true;
            } else {
                isStraightMoving = false;
                isSpeedIncreased = false;
            }
        }

        public Car(boolean isStraightMoving, boolean isSpeedIncreased) {
            this.gearSpeed = new int[] {0,1,2,3,4,5,6};
            this.currentGearSpeed = 0;
            this.isStraightMoving = isStraightMoving;
            if(isStraightMoving==true) {
                this.isSpeedIncreased = isSpeedIncreased;
            } else {
                this.isSpeedIncreased = false;
            }
        }

        @Override
        void steering() {
            System.out.println("Let's spin the steering wheel!!!");
        }
        void drive () {
            if (currentGearSpeed!=0){
            if (isStraightMoving==true) {
            System.out.println("Car moves forward along the road");}
            else System.out.println("Car moves backwards along the road");}
        }

        void gearChange() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Should we move forward? True/False");
            this.moveForward(sc.nextBoolean());
            if(isStraightMoving) {
                System.out.println("Should we increase speed? True/False");
                this.setSpeedIncrease(sc.nextBoolean());
                if(isSpeedIncreased){
                    while(currentGearSpeed<gearSpeed.length-1) {
                        currentGearSpeed = gearSpeed[++currentGearSpeed];
                        System.out.print("Current speed is " + currentGearSpeed + "." + " Should we increase speed more? True/False");
                        this.setSpeedIncrease(sc.nextBoolean());
                        if (isSpeedIncreased) continue;
                        else System.out.println("Current speed is " + currentGearSpeed); return;
                    }
                } else {
                    if(currentGearSpeed==0) System.out.println("Car is not moving. GearSpeed is \"N\"");
                    else {
                        while (currentGearSpeed > 0 && currentGearSpeed < gearSpeed.length) {
                            currentGearSpeed = gearSpeed[--currentGearSpeed];
                            System.out.println("Current speed is " + currentGearSpeed + "." + " Should we decrease speed more? True/False");
                            this.setSpeedIncrease(sc.nextBoolean());
                            if (isSpeedIncreased==true) continue;
                            else System.out.println("Current speed is " + currentGearSpeed); return;
                        }
                    }
                }
        } else {
                System.out.println("Current Gear Speed is \"R\"");
            currentGearSpeed = -1;}
        }
    }

    static class SportCar extends Car {
        public SportCar(boolean isStraightMoving, boolean isSpeedIncreased) {
            super(isStraightMoving,isSpeedIncreased);
        }
        void drive() {
            super.drive();
            if(currentGearSpeed!=0) System.out.println("But let's go on a sport track, it will be more funny");
            else System.out.println("Why are we not moving buddy?");

        }

    }

    public static void main(String[] args) {
        System.out.println("it's some unidentified vehicle");
        Vehicle car1 = new Vehicle();
        car1.steering();
        car1.drive();

        System.out.println("But this is a car");
        Car car = new Car(true,true);
        car.steering();
        car.gearChange();
        car.drive();


        System.out.println("Now we are talking. This is a sport car!");
        Car ferrari = new SportCar(false, true);
        ferrari.steering();
        ferrari.gearChange();
        ferrari.drive();


    }
}
