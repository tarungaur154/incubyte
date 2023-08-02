import java.util.Scanner;

public class Spacecraft {
    private int horPos, verPos, pos3D;
    private char facing;

    public Spacecraft(char initialDirection) {
        this.horPos = 0;
        this.verPos = 0;
        this.pos3D = 0;
        this.facing = Character.toUpperCase(initialDirection);
    }

    public void moveForward() {
        if (facing == 'N') {
            verPos++;
        } else if (facing == 'S') {
            verPos++;
        } else if (facing == 'E') {
            horPos++;
        } else if (facing == 'W') {
            horPos--;
        } else if (facing == 'U') {
            pos3D++;
        } else if (facing == 'D') {
            pos3D--;
        }
    }

    public void moveBackward() {
        if (facing == 'N') {
            verPos--;
        } else if (facing == 'S') {
            verPos--;
        } else if (facing == 'E') {
            horPos--;
        } else if (facing == 'W') {
            horPos++;
        } else if (facing == 'U') {
            pos3D--;
        } else if (facing == 'D') {
            pos3D++;
        }
    }

    public void turnLeft() {
        if (facing == 'N') {
            facing = 'W';
        } else if (facing == 'S') {
            facing = 'E';
        } else if (facing == 'E') {
            facing = 'N';
        } else if (facing == 'W') {
            facing = 'S';
        } else if (facing == 'U') {
            facing = 'W';
        }
    }

    public void turnRight() {
        if (facing == 'N') {
            facing = 'E';
        } else if (facing == 'S') {
            facing = 'W';
        } else if (facing == 'E') {
            facing = 'S';
        } else if (facing == 'W') {
            facing = 'N';
        } else if (facing == 'U') {
            facing = 'E';
        }
    }

    public void tiltUp() {
        if (facing == 'N' || facing == 'S' || facing == 'E' || facing == 'W') {
            facing = 'U';
        } else {
            System.out.println("Cannot tilt up when facing Up or Down!");
        }
    }

    public void tiltDown() {
        if (facing == 'N' || facing == 'S' || facing == 'E' || facing == 'W') {
            facing = 'D';
        } else {
            System.out.println("Cannot tilt down when facing Up or Down!");
        }
    }

    public void currPos() {
        System.out.println("Current Position: (" + horPos + ", " + verPos + ", " + pos3D + ")");
        System.out.println("Current Direction: " + facing);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial direction (N, S, E, W, U, D): ");
        char initialDirection = scanner.next().charAt(0);

        Spacecraft spacecraft = new Spacecraft(initialDirection);
        String command;

        while (true) {
            spacecraft.currPos();
            System.out.print("Enter the next command (f, b, l, r, u, d) or 'q' to quit: ");
            command = scanner.next();

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

        System.out.println("Final Position: (" + spacecraft.horPos + ", " + spacecraft.verPos + ", " + spacecraft.pos3D + ")");
        System.out.println("Final Direction: " + spacecraft.facing);
    }
}
