import java.util.Scanner;
class TimeToMunch {
    public static void main(String[]args){
        // ArrayList<Currency> Wallet = new ArrayList();
        Scanner input = new Scanner(System.in);
        Vending machine = new Vending();
        char selection;
        VendMenu();
        selection = Character.toUpperCase(input.nextLine().charAt(0));
        while (selection != 'Q') {
            switch (selection) {
                case 'S': System.out.print(machine.Show());
                    break;
                case 'I': CoinMenu();
                    selection = Character.toUpperCase(input.nextLine().charAt(0));
                    switch (selection) {
                        case 'A': machine.addCurrency(new Currency(0.05,"nickle"));
                            break;
                        case 'B': machine.addCurrency(new Currency(0.1,"dime"));
                            break;
                        case 'C': machine.addCurrency(new Currency(0.25,"quarter"));
                            break;
                        case 'D': machine.addCurrency(new Currency(1.0,"dollar"));
                        default: System.out.println("Error, incorrect option selected");
                            break;
                    }
                case 'B': //
                    break;
                case 'A': 
                    System.out.println("Description:");
                    String nameof = input.nextLine();
                    System.out.println("Price:");
                    double costof = input.nextDouble();
                    System.out.println("Quantity:");
                    int amount = input.nextInt();
                    machine.addProduct(new Product(costof,nameof,amount));
                default:
                    break;
            }
        }
    
    
    }

    public static void VendMenu() {
        System.out.println("S)how products I)nsert Coin B)uy A)dd Product R)emove Coins Q)uit");
    }

    public static void CoinMenu() {
        System.out.println("A) nickel @ 0.05\nB) dime @ 0.1\nC) quarter @ 0.25\nD) dallor @ 1.00");
    }
}
