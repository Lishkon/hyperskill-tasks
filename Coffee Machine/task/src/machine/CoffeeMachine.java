package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int initialAmountOfWater = 400;
        int initialAmountOfMilk = 540;
        int initialAmountOfCoffee = 120;
        int initialAmountOfCups = 9;
        int initialAmountOfMoney = 550;

        Scanner scanner = new Scanner(System.in);

        String action;


        do {
            System.out.println("Write action (buy, fill, take, remaining, exit)");

            action = scanner.next();

            String coffeeType;

            int amountOfWaterToAdd;
            int amountOfMilkToAdd;
            int amountOfCoffeeToAdd;
            int amountOfCupsToAdd;

            if (action.equalsIgnoreCase("exit")) {
                break;
            } else if (action.equalsIgnoreCase("remaining")) {
                System.out.printf("The coffee machine has: \n" +
                        "%d of water \n" +
                        "%d of milk \n" +
                        "%d of coffee beans \n" +
                        "%d of disposable cups \n" +
                        "%d of money \n\n", initialAmountOfWater, initialAmountOfMilk, initialAmountOfCoffee, initialAmountOfCups, initialAmountOfMoney);
            } else if (action.equalsIgnoreCase("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");

                coffeeType = scanner.next();

                if (coffeeType.equalsIgnoreCase("1")) {
                    if (initialAmountOfWater >= 250) {
                        if (initialAmountOfCoffee >= 16) {

                            System.out.println("I have enough resources, making you a coffee!\n");

                            initialAmountOfWater -= 250;
                            initialAmountOfCoffee -= 16;
                            initialAmountOfCups -= 1;
                            initialAmountOfMoney +=4;


                        } else {
                            System.out.println("Sorry, not enough water!\n");
                        }
                    }else {
                        System.out.println("Sorry, not enough water!\n");
                    }
                } else if (coffeeType.equalsIgnoreCase("2")) {
                    if (initialAmountOfWater >= 350) {
                        if (initialAmountOfMilk >= 75) {
                            if (initialAmountOfCoffee >= 20) {

                                System.out.println("I have enough resources, making you a coffee!\n");

                                initialAmountOfWater -= 350;
                                initialAmountOfMilk -= 75;
                                initialAmountOfCoffee -= 20;
                                initialAmountOfCups -= 1;
                                initialAmountOfMoney += 7;
                            } else {
                                System.out.println("Sorry, not enough coffee beans!\n");
                            }
                        } else {
                            System.out.println("Sorry, not enough milk!\n");
                        }
                    }else {
                        System.out.println("Sorry, not enough water!\n");
                    }
                } else if (coffeeType.equalsIgnoreCase("3")) {
                    if (initialAmountOfWater >= 200) {
                        if (initialAmountOfMilk >= 100) {
                            if (initialAmountOfCoffee >= 12) {

                                System.out.println("I have enough resources, making you a coffee!\n");

                                initialAmountOfWater -= 200;
                                initialAmountOfMilk -= 100;
                                initialAmountOfCoffee -= 12;
                                initialAmountOfCups -= 1;
                                initialAmountOfMoney += 6;

                            } else {
                                System.out.println("Sorry, not enough coffee beans!\n");
                            }
                        } else {
                            System.out.println("Sorry, not enough milk!\n");
                        }
                    }else {
                        System.out.println("Sorry, not enough water!\n");
                    }
                }
            } else if (action.equalsIgnoreCase("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                amountOfWaterToAdd = scanner.nextInt();

                initialAmountOfWater += amountOfWaterToAdd;

                System.out.println("Write how many ml of milk do you want to add:");
                amountOfMilkToAdd = scanner.nextInt();
                initialAmountOfMilk += amountOfMilkToAdd;

                System.out.println("Write how many grams of coffee beans do you want to add:");
                amountOfCoffeeToAdd = scanner.nextInt();

                initialAmountOfCoffee += amountOfCoffeeToAdd;

                System.out.println("Write how many disposable caps of coffee do you want to add:");
                amountOfCupsToAdd = scanner.nextInt();

                initialAmountOfCups += amountOfCupsToAdd;

            } else if (action.equalsIgnoreCase("take")) {
                System.out.printf("I gave you $%d \n\n",initialAmountOfMoney);
                initialAmountOfMoney = 0;
            }
        } while (!action.equalsIgnoreCase("exit"));

    }
}
