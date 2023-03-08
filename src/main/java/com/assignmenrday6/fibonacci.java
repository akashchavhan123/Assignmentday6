package com.assignmenrday6;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter term");
        int no = sc.nextInt();
        for (int i=1; i<=no;i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }
    }
}
