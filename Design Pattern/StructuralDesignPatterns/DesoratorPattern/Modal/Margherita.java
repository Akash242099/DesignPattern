package Modal;

public class Margherita extends PizzaDecorator{

    public Margherita(BasePizza basePizaa) {
        super(basePizaa);
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+100;
    }
    
}
