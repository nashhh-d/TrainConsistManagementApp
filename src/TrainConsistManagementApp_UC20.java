import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void searchBogie(List<String> bogies, String key) {

        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        boolean found = false;

        for (String b : bogies) {
            if (b.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie found: " + key);
        } else {
            System.out.println("Bogie not found.");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();

        try {
            searchBogie(bogies, "B101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}
