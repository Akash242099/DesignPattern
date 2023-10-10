package Main;


import Modal.BasePizza;
import Modal.Margherita;
import Modal.MashroomPizza;

public class DecoratorPatternTestClass {
    ////lets say client hace base pizza as mashroom pizza  so lets make object of samw
public static void main(String[] args){
    BasePizza mashroomPizza=new MashroomPizza();
////no client want to margheritaMashroomPizza 
////so now decorate mashroom pizza with margherita 
   BasePizza margheritaMashroomPizza=new Margherita(mashroomPizza);
System.out.println(margheritaMashroomPizza.cost());
}
}
