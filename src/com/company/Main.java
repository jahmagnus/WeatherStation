package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        boolean quit = false;
        System.out.println("0: quit\n"+
                "1: get temp data\n"+
                "2: show data");
        thermometer.setState(true);

        while(!quit) {
            int choice = sc.nextInt();


            switch (choice) {
                case 0:
                    quit = true;
                    System.out.println("Thermometer switching off");
                    thermometer.setState(false);
                    break;
                case 1:
                    getData();
                    break;
            }
        }
    }


    public static void getData(){
        System.out.println("Temp>>>:");
        double data = sc.nextDouble();
        thermometer.getCurrentValue(data);
    }





}
