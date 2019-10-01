import java.util.*;
class Vending{
    //wallet is just a counter for how many coins inside the vending machine
    private ArrayList<Currency> wallet;
    //name for whatever products are coming in
    private ArrayList<Product> products;

    public Vending(){
        this.wallet= new ArrayList<Currency>();
        this.products= new ArrayList<Product>();
    }

    public void addCurrency(Currency money) {
        this.wallet.add(money);
    }

    public void addProduct(Product item) {
        this.products.add(item);
    }

    public String Show() {
        StringBuilder builder = new StringBuilder();
        for (Product var : products) {
            builder.append(var.toString());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "hey im the veding machine toString";
    }
}

interface voidRunner {

}