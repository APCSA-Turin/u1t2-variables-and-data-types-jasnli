/* THIS PROGRAM WILL DETERMINE WHETHER YOU ATE A PIE OR NOT

 */

public class VariableLab {
    public static void main(String[] args) {
        // CONSTANTS
        final double PI = 3.14;
        final double GRAVITY = 9.81;

        // strings & dimensions
        String firstName;
        String lastName;
        double oldWeight;
        double newWeight;
        double pieWeight;
        int height;
        double pieRadius;
        boolean pieEaten;

        // INITIALIZATION
        firstName = "Jason";
        lastName = "Li";
        oldWeight = 140;
        newWeight = 148;
        height = 171;
        pieRadius = 4;
        pieWeight = 9 ;
        pieEaten = false;

        // PROGRAM
        if (newWeight - oldWeight == pieWeight) {
            pieEaten = true;
        }
        // PROFILE MAKER
        System.out.println("Name: " + firstName + "" + lastName);
        System.out.println("You are " + height + "cm tall.");
        System.out.println("Weight on Earth (N): " + newWeight * GRAVITY + " NEWTONS");
        System.out.println("Pie Area: " + pieRadius * pieRadius * PI + " square inches");
        if (pieEaten) {
            System.out.println("You have eaten all the pie");

        } else {
            System.out.println("You have not finished the pie.");
        }

    }
}
