import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Charles' Cafe!");
        System.out.println("What would you like to order (coffee/ tea/ juice)?");
        String drink = sc.nextLine().toLowerCase();

        System.out.println("Are you a loyalty Member?(yes/no)");
        String member = sc.nextLine().toLowerCase();

        boolean isMember = member.equals("yes");
        boolean validDrink = drink.equals("coffee") || drink.equals("tea") || drink.equals("juice");

        if (validDrink && isMember) {
            System.out.println("You are eligible for a 20% discount on your order!");
        } else if (validDrink && !isMember) {
            System.out.println("You are not a loyalty member, but you can still order " + drink + ".");
        } else {
            System.out.println("Sorry, we don't serve " + drink + ".");
        }
    }
}
