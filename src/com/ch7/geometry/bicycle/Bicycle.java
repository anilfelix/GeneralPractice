package com.ch7.geometry.bicycle;

/**
 * Created by This1 on 03/09/2015.
 */
public interface Bicycle extends Comparable {
    int NORTH = 1;

    void changePedalRate(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decreement);

    void printStates();


}
