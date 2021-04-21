public class MeniuVegan extends Preparat{
    public MeniuVegan(double price, double cantit) {
        super(price, cantit);
    }

    @Override
    public TipMeniu getTipMeniu() {
        return TipMeniu.VEGAN;
    }

}
