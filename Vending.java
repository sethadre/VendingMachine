import java.util.*;
import java.util.Map.Entry;
class Vending{
    //wallet is just a counter for how many coins inside the vending machine
    private ArrayList<Currency> wallet;
    //name for whatever products are coming in
    private HashMap<Character, Product> products;

    public Vending(){
        this.wallet= new ArrayList<Currency>();
        this.products= new HashMap<Character,Product>();
    }

    public void addCurrency(Currency money) {
        this.wallet.add(money);
        ;
    }

    public double removeAllCurrency() {
        double total = 0;
        while (!wallet.isEmpty()) {
            total += wallet.get(0).getValue();
            wallet.remove(0);
        }
        return total;
    }

    public void addProduct(Product item) {
        char key = 'A';
        key += products.size();

        this.products.put(key,item);
    }

    public boolean hasProduct(char b) {
        return products.containsKey(b);
    }

    public boolean outOfProducts() {
        return products.isEmpty();
    }

    public String Show() {
        StringBuilder builder = new StringBuilder();
        Iterator<Entry<Character,Product>> itr = products.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character,Product> pair = (Map.Entry<Character,Product>)itr.next();
            builder.append(pair.getValue().toString()+"\n");
        }
        return builder.toString();
    }

    public Product Buy(char b) {
        double total = 0;
        Product isBought = null;
        for (Currency coin : wallet) {
           total += coin.getValue();
           if (total >= products.get(b).getCost()) {
                isBought = new Product(products.get(b).getCost(),products.get(b).getName());
                products.get(b).sold();
                if (products.get(b).getAmount() < 1) {
                    products.remove(b);
                }
                break;
           }
        }
        return isBought;
    }

    public String ProductMenu() {
        StringBuilder builder = new StringBuilder();
        Iterator<Entry<Character,Product>> itr = products.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character,Product> pair = (Map.Entry<Character,Product>)itr.next();
            builder.append(pair.getKey()+") "+pair.getValue().toString()+"\n");
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