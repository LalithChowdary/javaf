import java.util.Scanner;

public class Flight {
    private static int count = 0;
    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please type 1 for First Class, 2 for Economy, 3 to exit booking");
            int n = in.nextInt();

            if (count >= 10) {
                System.out.println("Flight is full. Next flight in 3 hours.");
                break;
            }

            if (n == 1) {
                assignFirst();
            } else if (n == 2) {
                assignSecond();
            } else if (n == 3) {
                System.out.println("Thank you");
                break;
            }
        }
    }

    public static void assignFirst() {
        Scanner in = new Scanner(System.in);
        boolean assigned = false;
        int seat = 0;

        for (int i = 0; i < 5; i++) {
            if (!seats[i]) {
                seats[i] = true;
                assigned = true;
                count++;
                seat = i + 1;
                break;
            }
        }

        if (!assigned && count < 10) {
            System.out.println("First class is full. Would you like to be placed in economy? (yes/no)");
            String res = in.next();
            if (res.equalsIgnoreCase("yes")) {
                assignSecond();
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        } else if (assigned) {
            System.out.println("Boarding Pass: First Class, Seat " + seat);
        }
    }

    public static void assignSecond() {
        Scanner in = new Scanner(System.in);
        boolean assigned = false;
        int seat = 0;

        for (int i = 5; i < 10; i++) {
            if (!seats[i]) {
                seats[i] = true;
                assigned = true;
                seat = i + 1;
                count++;
                break;
            }
        }

        if (!assigned && count < 10) {
            System.out.println("Economy is full. Would you like to be placed in First class? (yes/no)");
            String res = in.next();
            if (res.equalsIgnoreCase("yes")) {
                assignFirst();
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        } else if (assigned) {
            System.out.println("Boarding Pass: Economy, Seat " + seat);
        }
    }
}
