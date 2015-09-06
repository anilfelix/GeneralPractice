package com.ch7.geometry.bicycle;

/**
 * Created by This1 on 03/09/2015.
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Bicycle Huffy = new MountainBike();
        Bicycle b2 = new MountainBike();
        b2.speedUp(3);

        int res = Huffy.compareTo(Huffy);
        System.out.println(res);


        Huffy.printStates();
        System.out.println("==========");
        Huffy.changePedalRate(2);
        Huffy.speedUp(5);
        Huffy.changeGear(1);
        System.out.println("After updating the states: ");
        Huffy.printStates();

    }


}
