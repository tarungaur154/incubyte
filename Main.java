package main;

import java.util.Scanner;
import spacecraft.Spacecraft;

public class Main {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            spacecraft.printCurrentPositionAndDirection();
            System.out.print("Enter the next command (f, b, l, r, u, d) or 'q' to quit: ");
            command = scanner.nextLine();

            if (command.equals("q")) {
                break;
            }

            if (command.equals("f")) {
                spacecraft.moveForward();
            } else if (command.equals("b")) {
                spacecraft.moveBackward();
            } else if (command.equals("l")) {
                spacecraft.turnLeft();
            } else if (command.equals("r")) {
                spacecraft.turnRight();
            } else if (command.equals("u")) {
                spacecraft.tiltUp();
            } else if (command.equals("d")) {
                spacecraft.tiltDown();
            } else {
                System.out.println("Invalid command: " + command);
            }
        }

        System.out.println("Final Position: (" + spacecraft.getX() + ", " + spacecraft.getY() + ", " + spacecraft.getZ() + ")");
        System.out.println("Final Direction: " + spacecraft.getDirection());
    }
}
