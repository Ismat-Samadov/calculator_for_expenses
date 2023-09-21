import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define item earnings
        double bubblegumEarnings = 202.0;
        double toffeeEarnings = 118.0;
        double iceCreamEarnings = 2250.0;
        double milkChocolateEarnings = 1680.0;
        double doughnutEarnings = 1075.0;
        double pancakeEarnings = 80.0;

        // Calculate total earnings
        double totalEarnings = bubblegumEarnings + toffeeEarnings + iceCreamEarnings
                + milkChocolateEarnings + doughnutEarnings + pancakeEarnings;

        // Print item earnings
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubblegumEarnings);
        System.out.println("Toffee: $" + toffeeEarnings);
        System.out.println("Ice cream: $" + iceCreamEarnings);
        System.out.println("Milk chocolate: $" + milkChocolateEarnings);
        System.out.println("Doughnut: $" + doughnutEarnings);
        System.out.println("Pancake: $" + pancakeEarnings);

        // Print total earnings
        System.out.println("\nIncome: $" + totalEarnings);

        // Ask for staff expenses
        Scanner scanner = new Scanner(System.in);
        System.out.print("Staff expenses: $");
        double staffExpenses = scanner.nextDouble();

        // Ask for other expenses
        System.out.print("Other expenses: $");
        double otherExpenses = scanner.nextDouble();
        scanner.close();

        // Calculate net income
        double netIncome = totalEarnings - staffExpenses - otherExpenses;

        // Print net income
        System.out.println("Net income: $" + netIncome);
    }
}
