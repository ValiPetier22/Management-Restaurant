public abstract class Preparat {
    protected double price;
    protected double cantit;

    public Preparat(double price, double cantit) {
        this.price = price;
        this.cantit = cantit;
    }

    public double getPrice() {
        return price;
    }

    public double getCantit() {
        return cantit;
    }

    public abstract TipMeniu getTipMeniu();
}
