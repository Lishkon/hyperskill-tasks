package machine;

public class Machine {
    private int initialAmountOfWater;
    private int initialAmountOfMilk;
    private int initialAmountOfCoffeeBeans;
    private int initialAmountOfCups;
    private int initialAmountOfMoney;
    private String input;

    Status state = Status.READY;

    public Machine(int initialAmountOfWater, int initialAmountOfMilk, int initialAmountOfCoffeeBeans, int initialAmountOfCups, int initialAmountOfMoney) {
        this.initialAmountOfWater = initialAmountOfWater;
        this.initialAmountOfMilk = initialAmountOfMilk;
        this.initialAmountOfCoffeeBeans = initialAmountOfCoffeeBeans;
        this.initialAmountOfCups = initialAmountOfCups;
        this.initialAmountOfMoney = initialAmountOfMoney;
    }

    private void buy() {
        switch (this.state) {
            case READY:
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                this.state = Status.BUYING;
                break;
            case BUYING:
                boolean readyToBuy = checkResources(this.input);

                switch (this.input) {
                    case "1":
                        if (readyToBuy) {
                            this.initialAmountOfWater -= 250;
                            this.initialAmountOfCoffeeBeans -= 16;
                            this.initialAmountOfCups -= 1;
                            this.initialAmountOfMoney += 4;
                        }
                        ready();
                        break;
                    case "2":
                        if (readyToBuy) {
                            this.initialAmountOfWater -= 350;
                            this.initialAmountOfMilk -= 75;
                            this.initialAmountOfCoffeeBeans -= 20;
                            this.initialAmountOfCups -= 1;
                            this.initialAmountOfMoney += 7;
                        }
                        ready();
                        break;
                    case "3":
                        if (readyToBuy) {
                            this.initialAmountOfWater -= 200;
                            this.initialAmountOfMilk -= 100;
                            this.initialAmountOfCoffeeBeans -= 12;
                            this.initialAmountOfCups -= 1;
                            this.initialAmountOfMoney += 6;
                        }
                        ready();
                        break;
                    default:
                        System.out.println("unknown command. make your decision");
                        ready();
                        break;
                }

        }

    }

    private void fill() {
        switch (this.state) {
            case READY:
                System.out.println("Write how many ml of water do you want to add:");
                this.state = Status.ADDING_WATER;
                break;
            case ADDING_WATER:
                this.initialAmountOfWater += Integer.parseInt(this.input);
                System.out.println("Write how many ml of milk do you want to add:");
                this.state = Status.ADDING_MILK;
                break;
            case ADDING_MILK:
                this.initialAmountOfMilk += Integer.parseInt(this.input);
                System.out.println("Write how many gr of coffee beans do you want to add:");
                this.state = Status.ADDING_COFFEE_BEANS;
                break;
            case ADDING_COFFEE_BEANS:
                this.initialAmountOfCoffeeBeans += Integer.parseInt(this.input);
                System.out.println("Write how many disposable cups do you want to add:");
                this.state = Status.ADDING_CUPS;
                break;
            case ADDING_CUPS:
                this.initialAmountOfCups += Integer.parseInt(this.input);
                this.state = Status.READY;
                ready();
                break;
            default:
                System.out.println("Incorrect status triggered... Setting back to standby mode");
                ready();
                break;
        }

    }

    private void take() {
        System.out.println("I gave you $" + initialAmountOfMoney);
        initialAmountOfMoney = 0;
        ready();
    }

    public void start() {
        ready();
    }

    private void exit() {
        this.state = Status.EXITING;
    }

    private void ready() {
        this.state = Status.READY;
        System.out.println("Write action (buy, fill, take, remaining, exit)");
    }

    private void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(this.initialAmountOfWater + " of water");
        System.out.println(this.initialAmountOfMilk + " of milk");
        System.out.println(this.initialAmountOfCoffeeBeans + " of coffee beans");
        System.out.println(this.initialAmountOfCups + " of disposable cups");
        System.out.println(this.initialAmountOfMoney + " of money");

        ready();
    }

    private boolean checkResources(String input) {
        boolean isEnoughResources = false;

        int requiredWaterAmount;
        int requiredMilkAmount;
        int requiredCoffeeBeansAmount;
        int requiredCupsAmount;

        switch (input) {
            case "1": // espresso
                requiredWaterAmount = 250;
                requiredCoffeeBeansAmount = 16;
                requiredMilkAmount = 0;
                requiredCupsAmount = 1;
                break;
            case "2": // latte
                requiredWaterAmount = 350;
                requiredCoffeeBeansAmount = 20;
                requiredMilkAmount = 75;
                requiredCupsAmount = 1;
                break;
            case "3": // cappuccino
                requiredWaterAmount = 200;
                requiredCoffeeBeansAmount = 12;
                requiredMilkAmount = 100;
                requiredCupsAmount = 1;
                break;
            default:
                return false;
        }

        if (initialAmountOfWater < requiredWaterAmount) {
            System.out.println("Sorry, not enough water!");
        } else if (initialAmountOfMilk < requiredMilkAmount) {
            System.out.println("Sorry, not enough milk!");
        } else if (initialAmountOfCoffeeBeans < requiredCoffeeBeansAmount) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (initialAmountOfCups < requiredCupsAmount) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!\n");
            isEnoughResources = true;
        }

        return isEnoughResources;
    }
    public void inputProcess(String input) {
        this.input = input;

        switch (this.state) {
            case READY:
                processReadyCommand();
                break;
            case BUYING:
                buy();
                break;
            case TAKING:
                take();
                break;
            case FILLING:
            case ADDING_WATER:
            case ADDING_MILK:
            case ADDING_COFFEE_BEANS:
            case ADDING_CUPS:
                fill();
                break;
            case REMAINING:
                remaining();
                break;
            case EXITING:
                exit();
                break;
            default:
                System.out.println("unknown command, try again");
                ready();
                break;
        }
    }

    public void processReadyCommand() {
        switch (input) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                remaining();
                break;
            case "exit":
                exit();
                break;
            default:
                System.out.println("Unknown command, please select the one from the list:");
                ready();
                break;
        }
    }
}
