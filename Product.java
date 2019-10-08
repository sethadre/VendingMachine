class Product {
    private double cost;
    private String name;
    private int amount;

    public Product() {
        this.cost = 0;
        this.name = "";
        this.amount = 0;
    }

    public Product(double x, String name, int amnt) {
        this.cost = x;
        this.name = name;
        this.amount = amnt;
    }

    public double getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " @ $" +String.format("%.2f", cost));
        return builder.toString();
    }
}