import java.util.Scanner;

public class EBM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votes1 = 0, votes2 = 0, votes3 = 0;

        while (true) {
            System.out.print("Enter age of voter (or -1 to exit): ");
            int age = scanner.nextInt();

            if (age == -1) {
                break;
            }

            if (age < 18) {
                System.out.println("You are not eligible to vote.\n");
                continue;
            }

            System.out.println("Choose your candidate:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
            System.out.print("Enter your vote (1, 2 or 3): ");
            int vote = scanner.nextInt();

            switch (vote) {
                case 1 -> {
                    votes1++;
                    System.out.println("Vote recorded for Candidate A\n");
                }
                case 2 -> {
                    votes2++;
                    System.out.println("Vote recorded for Candidate B\n");
                }
                case 3 -> {
                    votes3++;
                    System.out.println("Vote recorded for Candidate C\n");
                }
                default -> System.out.println("Invalid vote! Please enter 1, 2, or 3.\n");
            }
        }

        System.out.println("\nVoting session ended.");
        System.out.println("Total votes:");
        System.out.println("Candidate A: " + votes1);
        System.out.println("Candidate B: " + votes2);
        System.out.println("Candidate C: " + votes3);
    }
}