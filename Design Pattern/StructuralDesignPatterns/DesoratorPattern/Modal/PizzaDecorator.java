package Modal;

public abstract class PizzaDecorator implements BasePizza {
public BasePizza basePizza;
PizzaDecorator(BasePizza basePizaa){
    this.basePizza=basePizaa;
}
}
