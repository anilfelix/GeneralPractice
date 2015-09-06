package com.ch7.geometry.bicycle;

/**
 * Created by This1 on 03/09/2015.
 */
public class MountainBike implements Bicycle {

    int pedalRate = 0;
    int speed = 0;
    int gear = 1;

    @Override
    public void changePedalRate(int newValue) {
        pedalRate = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decreement) {
        speed = speed - decreement;
    }

    @Override
    public void printStates() {
        System.out.println("Pedal rate: " + pedalRate);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }


    @Override
    public int compareTo(Object o) {
        MountainBike mb = (MountainBike) o;
        if (this.speed == mb.speed) {
            return 0;
        } else if (this.speed > mb.speed) {
            return 1;
        } else {
            return -1;
        }
    }
}
