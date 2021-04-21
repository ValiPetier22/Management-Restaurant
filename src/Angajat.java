public class Angajat {
    protected Restaurant restaurant;
    protected String FirstName,LastName;
    protected double salary;
    protected int norma;

    public Angajat(Restaurant restaurant, String firstName, String lastName, double salary, int norma) {
        FirstName = firstName;
        LastName = lastName;
        this.salary = salary;
        this.norma = norma;
        this.restaurant=restaurant;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getNorma() {
        return norma;
    }
}
