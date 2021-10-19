public class Caramel extends AbstractDecorator{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double price() {
        return 0.2+ boisson.price();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Caramel";
    }
}
