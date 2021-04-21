public class SupeCiorbe extends Preparat{
    public SupeCiorbe(double price, double cantit) {
        super(price, cantit);
    }

    @Override
    public TipMeniu getTipMeniu() {
        return TipMeniu.SUPA;
    }
}
