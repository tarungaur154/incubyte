public class TestCases {
    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        System.out.println("Enter the initial direction (N, S, E, W, U, D): N");
        Spacecraft spacecraft1 = new Spacecraft('N');
        spacecraft1.moveForward();
        spacecraft1.turnRight();
        spacecraft1.tiltUp();
        spacecraft1.moveBackward();
        spacecraft1.turnLeft();
        spacecraft1.tiltDown();
        spacecraft1.currPos();
        System.out.println("Final Position: (" + spacecraft1.horPos + ", " + spacecraft1.verPos + ", " + spacecraft1.pos3D + ")");
        System.out.println("Final Direction: " + spacecraft1.facing);

        boolean testCase1Passed = (spacecraft1.horPos == 0 && spacecraft1.verPos == 1 && spacecraft1.pos3D == 0 && spacecraft1.facing == 'W');
        System.out.println("Test Case 1 Passed: " + testCase1Passed);

        System.out.println("\nTest Case 2:");
        System.out.println("Enter the initial direction (N, S, E, W, U, D): S");
        Spacecraft spacecraft2 = new Spacecraft('S');
        spacecraft2.moveForward();
        spacecraft2.turnLeft();
        spacecraft2.tiltUp();
        spacecraft2.moveBackward();
        spacecraft2.turnRight();
        spacecraft2.tiltDown();
        spacecraft2.currPos();
        System.out.println("Final Position: (" + spacecraft2.horPos + ", " + spacecraft2.verPos + ", " + spacecraft2.pos3D + ")");
        System.out.println("Final Direction: " + spacecraft2.facing);

        boolean testCase2Passed = (spacecraft2.horPos == 0 && spacecraft2.verPos == -1 && spacecraft2.pos3D == 0 && spacecraft2.facing == 'E');
        System.out.println("Test Case 2 Passed: " + testCase2Passed);
    }
}
