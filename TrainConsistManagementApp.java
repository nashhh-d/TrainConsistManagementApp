import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B410", "B512"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) { // safe string comparison
                found = true;
                break; // early termination
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID found in the train.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}