package Pizza;

public class Crust extends PizzaD{
    public PizzaD removeAnchovy(){
        return remFn.forCrust();
    }
    public PizzaD topAnchovywithCheese(){ return topFn.forCurst(); }
    public String toString(){
        return  "new " + getClass().getName() + "(" + ")";
    }
}
