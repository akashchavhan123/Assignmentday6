package com.assignmenrday6;

import java.util.Random;

public class Coupon {
    int cop = 3;
    Random r = new Random();
    int flip = r.nextInt(4);

    void fun() {
        if (flip == 0) {
            System.out.println("Coupon no " + flip + " " + "Red");
        } else if (flip == 1) {
            System.out.println("Coupon no " + flip + " " + "Green");
        } else if (flip == 2) {
            System.out.println("Coupon no " + flip + " " + "orange");
        } else if (flip == 3) {
            System.out.println("Coupon no " + flip + " " + "White");
        } else {
            System.out.println("Coupon no " + flip + " " +"out");

        }
    }


    public static void main(String[] args) {
        Coupon ob = new Coupon();
        ob.fun();
    }
}
