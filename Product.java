class Product {
    private double cost;
    private String name;
    public Product() {
        this.cost = 0;
        this.name = "";
    }

    public Product(double x, String name) {
        this.cost = x;
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }
}