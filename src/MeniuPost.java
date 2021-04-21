public class MeniuPost extends Preparat{
    public MeniuPost(double price, double cantit) {
        super(price, cantit);
    }

    @Override
    public TipMeniu getTipMeniu() {
        return TipMeniu.POST;
    }
}
