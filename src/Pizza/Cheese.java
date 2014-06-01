package Pizza;

public class Cheese extends PizzaD{
    PizzaD p;
    public Cheese(PizzaD _p){
        p = _p;
    }
    public PizzaD removeAnchovy(){
        return remFn.forCheese(p);
    }
    public PizzaD topAnchovywithCheese(){return topFn.forCheese(p);}

    public String toString(){
        return  "new " + getClass().getName() + "(" + p + ")";
    }
}
