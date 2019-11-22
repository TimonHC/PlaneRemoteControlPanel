package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

    class Plane extends Thread {
    Scanner scan = new Scanner(System.in);
    private int totalPoints;
    String[] route;

    void Fly(String[] route){
        try{
            for (int i = 0; i < route.length - 1; i++) {
                System.out.println("✈ from: " + route[i] + " to " + route[i+1]+"\ndone");
            }}catch (NullPointerException e){
            System.out.println("The route is doesnt exist, plese create the route to fly");
        }
}

    void SetRoute() throws InputMismatchException, NegativeArraySizeException, NullPointerException {
        try{
            System.out.println("Enter the number of checkpoints: ");
        totalPoints = scan.nextInt();
        route = new String[totalPoints];
        if (totalPoints > 0){
        System.out.println("Enter next checkpoints: ");
        for (int i = 0; i < route.length; i++) {
            System.out.print(i+1 + ". ");
            route[i] = scan.next();

      }}}catch (InputMismatchException | NegativeArraySizeException e){
            System.out.println("Route input error, enter the positive integer number please");
        }}

    void PrintRoute(String[] route){
        if (totalPoints!=0&&totalPoints>0){
        System.out.println("Choosen Route: ");
        for (int i = 0; i < route.length; i++) {
            System.out.println(i+1 + ". " + route[i]+";");
        }
        }}


}
