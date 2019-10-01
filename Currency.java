public class Currency extends Vending{
    private double value;
    private String name;


    public Currency(){
        this.value = 0;
        this.name = "";
    }

    public Currency(double value, String name){
        this.value = value;
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(this.name + " @ .2f",this.value));
        return builder.toString();
    }
}