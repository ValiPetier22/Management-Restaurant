public class Ospatar extends Angajat{
    public Ospatar(Restaurant restaurant, String firstName, String lastName, double salary, int norma) {
        super(restaurant, firstName, lastName, salary, norma);
    }

    public void addPreparat(Factura factura, Preparat preparat, int nr){
        if(restaurant.existsMenu(preparat.getTipMeniu(), nr)) {
            factura.addPreparat(preparat, nr);
            restaurant.extract(preparat.getTipMeniu(), nr);
        }
    }

    public void addFactura(Factura factura){
        this.restaurant.addFactura(factura);
    }
}
