package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String file ="data\\file.txt";
        File f = new File(file);
        int b;
        FileReader is = null;
        String menuSelection;
        try{
            is = new FileReader(f);
            while ((b = is.read()) != -1) {
                System.out.print((char)b);
            }
        }catch (IOException e){
            System.err.print("file error " + e);
        }finally {
            try {
                if (is != null){
                    is.close();
                }}
                catch (IOException e)
                {
                    System.err.println("close error " + e);
                }
            }

        Plane plane = new Plane();
        do{ System.out.println("\nmenu selection:\n1 - set route\n2 - print route\n3 - fly by choosen route\n0 - exit");
        menuSelection = plane.scan.next();
                    switch (menuSelection) {
                        case ("1"):
                            plane.SetRoute();
                            break;
                        case ("2"):
                            plane.PrintRoute(plane.route);
                            break;
                        case ("3"):
                            plane.Fly(plane.route);
                            break;
                        case ("0"):
                            System.out.println("Thx 4 using our autopilot plane control system, Goodbye! :-)");
                            break;
                        default: System.out.println("Invalid menu choise");
                    }}while (!menuSelection.equals("0"));
    }
}