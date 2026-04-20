import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs (important for binary search)
        String[] bogieIds = {"B101", "B205", "B309", "B410", "B512"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } 
            else if (comparison > 0) {
                low = mid + 1; // search right half
            } 
            else {
                high = mid - 1; // search left half
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID found using Binary Search.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}