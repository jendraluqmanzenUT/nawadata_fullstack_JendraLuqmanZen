import java.util.Arrays;
import java.util.Scanner;

public class PSBB_no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of families: ");
        int numberOfFamilies = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the number of members in each family (separated by a space): ");
        String[] membersInput = scanner.nextLine().trim().split("\\s+");


        if (membersInput.length != numberOfFamilies) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        int[] members = new int[numberOfFamilies];
        try {
            for (int i = 0; i < numberOfFamilies; i++) {
                members[i] = Integer.parseInt(membersInput[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers for family members.");
            return;
        }

        // Calculate the minimum number of buses required
        int busesRequired = calculateMinimumBuses(members);
        System.out.println("Minimum bus required is: " + busesRequired);
    }

    private static int calculateMinimumBuses(int[] members) {
        Arrays.sort(members);
        int buses = 0;
        int left = 0;
        int right = members.length - 1;


        while (left <= right) {
            if (members[left] + members[right] <= 4) {
                left++;
            }
            right--;
            buses++;
        }

        return buses;
    }
}
