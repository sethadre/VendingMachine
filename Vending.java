import java.util.*;
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
    }

    public void addProduct(Product item) {
        char key = 'A';
        key += products.size();

        this.products.put(key,item);
    }

    public String Show() {
        StringBuilder builder = new StringBuilder();
        Iterator<Entry<Character,String>> itr = products.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Character,Product> pair = (Map.Entry<Character,Product>)itr.next();
            builder.append(pair.getValue().getName() + " @ "+pair.getValue().getCost()+ "\n");
        }
        return builder.toString();
    }

    public boolean Buy(char b) {
        double total = 0;
        boolean isBought = false;
        for (Currency coin : wallet) {
           total += coin.getValue();
           if (total > products.get(b).getCost()) {

           }
        }

    }

    @Override
    public String toString() {
        return "hey im the veding machine toString";
    }
}

interface voidRunner {

}