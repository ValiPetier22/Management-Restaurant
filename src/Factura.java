import java.util.LinkedList;

public class Factura {
    private LinkedList<Preparat> numePreparat = new LinkedList<>();

    public double getPrice() {
        double price = 0;
        for (Preparat preparat : numePreparat) {
            price += preparat.getPrice();
        }
        return price;
    }

    public void addPreparat(Preparat p, int nr) {
        for (int i = 1; i <= nr; i++)
            numePreparat.add(p);
    }
}