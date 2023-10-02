import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("----------------------------------------------------");

        // Input: Number of people in the group
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();

        // Input: Tip percentage
        System.out.print("What's the tip percentage? (0 - 100): ");
        int percenttip = scan.nextInt();

        double cost = 0;

        // Input: Cost of items until user enters -1
        System.out.print("Enter a cost in dollars and cents: ");
        double cost2 = scan.nextDouble();
        cost += cost2;

        while (cost2 != -1) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost2 = scan.nextDouble();
            cost += cost2;
        }
        cost += 1;

        // Calculate and display total bill before tip
        System.out.println("----------------------------------------------------");
        double beforetip = cost;
        System.out.println("Total bill before tip: " + beforetip);
        System.out.println("Total percentage: " + percenttip + "%");

        // Calculate and display total tip amount
        double totaltip = beforetip * (percenttip / 100.0);
        double roundedtotaltip = Math.round(totaltip * 100) / 100.00;
        System.out.println("Total Tip: $" + roundedtotaltip);

        // Calculate and display total bill with tip
        double billwtip = beforetip + roundedtotaltip;
        System.out.println("Total bill with Tip: $" + billwtip);

        // Calculate and display per person cost before tip
        double personbeforetip = beforetip / people;
        double roundedpersonbeforetip = Math.round(personbeforetip * 100) / 100.00;
        System.out.println("Per Person before tip: $" + (roundedpersonbeforetip));

        // Calculate and display tip per person
        double tipperperson = roundedtotaltip / people;
        double roundedtipperperson = Math.round(tipperperson * 100) / 100.00;
        System.out.println("Tip per person: $" + (roundedtipperperson));

        // Calculate and display total cost per person
        double costperperson = billwtip / people;
        double roundedcostperperson = Math.round(costperperson * 100) / 100.00;
        System.out.println("Total cost per person: $" + (roundedcostperperson));

        System.out.println("----------------------------------------------------");

        // Input: Food and service rating
        System.out.print("How would you rate our food and service? (0 - 100): ");
        int service = scan.nextInt();

        // Provide feedback based on the rating
        if (service <= 50) {
            System.out.println("We are deeply sorry for our poor service. We hope you will have a more enjoyable experience next time!");
        } else {
            System.out.println("Thank you for your patronage!");
        }

        System.out.println("----------------------------------------------------");

        // Input and display user feedback
        System.out.println("Please provide your feedback:");
        scan.nextLine(); // Consume the newline character left in the buffer
        String feedback = scan.nextLine();
        System.out.println("Thank you for your feedback: " + feedback);
    }
}