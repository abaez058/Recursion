import java.util.Scanner;

public class Main {


    public static int handshake(int n) {
        if (n <= 1) {
            return 0;
        }
        return handshake(n - 1) + (n - 1);
    }


    public static int combination(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        return combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Handshake
        System.out.print("How many people are in the room? ");
        int n = scanner.nextInt();
        int totalHandshakes = handshake(n);
        System.out.println("\nIf everyone shakes hands once, there will be " + totalHandshakes + " handshakes.");

        // Combination
        System.out.print("\nEnter n for combination calculation: ");
        int nCombination = scanner.nextInt();
        System.out.print("Enter r for combination calculation: ");
        int rCombination = scanner.nextInt();

        if (nCombination >= rCombination) {
            int result = combination(nCombination, rCombination);
            System.out.println("\nThere are " + result + " possible combinations.");
        } else {
            System.out.println("\nInvalid input: n must be greater than or equal to r.");
        }

        scanner.close();
    }
}
