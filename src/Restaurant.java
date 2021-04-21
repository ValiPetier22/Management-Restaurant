import com.sun.source.tree.BreakTree;

import java.util.LinkedList;

public class Restaurant {
    private LinkedList<Angajat> angajati = new LinkedList<>();
    private LinkedList<Preparat> preparate = new LinkedList<>();
    private LinkedList<Factura> facturi = new LinkedList<>();

    public Restaurant() {
        angajati.add(new Bucatar(this, "Vali", "Petier", 2500, 8));
        angajati.add(new Bucatar(this, "Andrei", "Irimescu", 2400, 6));
        angajati.add(new Ospatar(this, "Florin", "Avram", 1800, 4));
        angajati.add(new Ospatar(this, "Alex", "Andrei", 3000, 8));
        angajati.add(new Manager(this, "Catalin", "Enache", 5000, 8));

        MeniuPost meniuPost = new MeniuPost(30, 7);
        MeniuVegan meniuVegan = new MeniuVegan(24, 2);
        SupeCiorbe supeCiorbe = new SupeCiorbe(15, 2);

        preparate.add(meniuPost);
        preparate.add(meniuVegan);
        preparate.add(supeCiorbe);
    }

    public void addFactura(Factura factura) {
        facturi.add(factura);
    }

    public boolean existsMenu(TipMeniu tipMeniu, int nr) {
        for (Preparat preparat : preparate)
            if (preparat.getTipMeniu() == tipMeniu)
                if (preparat.getCantit() >= nr)
                    return true;
        return false;
    }

    public void extract(TipMeniu tipMeniu, int nr) {
        for (Preparat preparat : preparate)
            if (preparat.getTipMeniu() == tipMeniu)
                preparat.cantit-=nr;
    }


    public void request(TipMeniu tipMeniu, int nr) {
        Ospatar o = (Ospatar) angajati.get(2); // al treilea angajat din lista este ospatar
        Factura factura = new Factura();
        o.addPreparat(factura, preparate.get(0), nr);
        o.addFactura(factura);
        System.out.println(factura.getPrice());
    }
}
