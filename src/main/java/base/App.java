package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright Marc-Anthony Cross
 */

public class App {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String carSilent = isCarSilent();
        if (carSilent.equals("y")) {
            if (areCorroded().equals("y"))
                System.out.println("Clean terminals and try starting again.");
            else
                System.out.println("Replace cables and try again.");
        }
        else {
            if (makesSlickingNoise().equals("y"))
                System.out.println("Replace the battery.");
            else {
                if (failsToStart().equals("y"))
                    System.out.println("Check spark plug connections.");
                else {
                    if (engineDies().equals("y")) {
                        if (hasFuelInjection().equals("y"))
                            System.out.println("Get it in for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.println("This should not be possible.");
                }
            }
        }
    }

    public static String hasFuelInjection() {
        System.out.print("Does your car have fuel injection? ");
        return in.nextLine();
    }

    public static String engineDies() {
        System.out.print("Does the engine start and then die? ");
        return in.nextLine();
    }

    public static String failsToStart() {
        System.out.print("Does the car crank up but fail to start? ");
        return in.nextLine();
    }

    public static String makesSlickingNoise() {
        System.out.print("Does the car make a slicking noise? ");
        return in.nextLine();
    }

    public static String areCorroded() {
        System.out.print("Are the battery terminals corroded? ");
        return in.nextLine();
    }

    public static String isCarSilent() {
        System.out.print("Is the car silent when you turn the key? ");
        return in.nextLine();
    }
}
