package Pizza;

public class Sausage extends PizzaD{
    PizzaD p;
    public Sausage(PizzaD _p){
        p = _p;
    }
    public PizzaD removeAnchovy(){
        return remFn.forSausage(p);
    }
    public PizzaD topAnchovywithCheese(){
        return topFn.forSausage(p);}
    public String toString(){
        return  "new " + getClass().getName() + "(" + p + ")";
    }
}
