package Pizza;

public class Anchovy extends PizzaD{
    PizzaD p;
    public Anchovy(PizzaD _p){
        p = _p;
    }
    public PizzaD removeAnchovy(){
        return remFn.forAnchovy(p);
    }
    public PizzaD topAnchovywithCheese(){return topFn.forAnchovy(p);}
    public String toString(){
        return  "new " + getClass().getName() + "(" + p + ")";
    }
}
