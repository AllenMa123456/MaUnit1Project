import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("----------------------------------------------------");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0 - 100): ");
        int percenttip = scan.nextInt();

        double cost = 0;
        System.out.print("Enter a cost in dollars and cents: ");
        double cost2 = scan.nextDouble();
        cost += cost2;

        while (cost2 != -1) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost2 = scan.nextDouble();
            cost += cost2;
        }
        cost +=1;
        System.out.println("----------------------------------------------------");
        double beforetip = cost;
        System.out.println("Total bill before tip: " + beforetip);
        System.out.println("Total percentage: " + percenttip + "%");
        double totaltip = beforetip * (percenttip / 100.0 );
        double roundedtotaltip = Math.round(totaltip * 100) / 100.00;
        System.out.println("Total Tip: $" + roundedtotaltip);
        double billwtip = beforetip + roundedtotaltip;
        System.out.println("Total bill with Tip: $" + billwtip);
        double personbeforetip = beforetip / people;
        double roundedpersonbeforetip = Math.round(personbeforetip * 100) / 100.00;
        System.out.println("Per Person before tip: $" + (roundedpersonbeforetip));
        double tipperperson = roundedtotaltip / people;
        double roundedtipperperson = Math.round(tipperperson * 100) / 100.00;
        System.out.println("Tip per person: $" + (roundedtipperperson));
        double costperperson = billwtip / people;
        double roundedcostperperson = Math.round(costperperson * 100) / 100.00;
        System.out.println("Total cost per person: $" + (roundedcostperperson));
        System.out.println("----------------------------------------------------");
        System.out.print("How would you rate our food and service? (0 - 100): ");
        int service = scan.nextInt();
        if (service <= 50) {
            System.out.print("We are deeply sorry for our poor service. We hope you will have a more enjoyable experience next time!");
        }  else {
            System.out.print("Thank you for your patronage!");
        }




    }
}
