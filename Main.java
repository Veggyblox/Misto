import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the movie rating count: ");
        int rating = scanner.nextInt();
        
        // Nested conditionals to classify the rating based on the criteria
        if (rating > 5000) {
            if (rating > 25000) {
                if (rating > 45000) {
                    if (rating > 70000) {
                        if (rating > 75000) {
                            System.out.println("Out of the world");
                        } else {
                            System.out.println("Best");
                        }
                    } else {
                        System.out.println("Best");
                    }
                } else {
                    System.out.println("Better");
                }
            } else {
                System.out.println("Good");
            }
        } else {
            System.out.println("Rating is too low to classify.");
        }
        
        scanner.close();
    }
}
