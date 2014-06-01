package Pizza;

public class Olive extends PizzaD{
    PizzaD p;
    public Olive(PizzaD _p){
        p = _p;
    }
    public PizzaD removeAnchovy(){
        return remFn.forOlive(p);
    }
    public PizzaD topAnchovywithCheese(){return topFn.forOlive(p);}
    public String toString(){
        return  "new " + getClass().getName() + "(" + p + ")";
    }
}
