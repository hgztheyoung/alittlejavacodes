package Shish;

public class Lamb extends ShishD {
    ShishD s;

    public Lamb(ShishD _s){
        s = _s;}

    public String toString(){
        return  "new " + getClass().getName() + "(" + s + ")";
    }

    public boolean onlyOnions(){
        return ooFn.forLamb(s);
    }
    public boolean isVegetarian(){
        return  ivFn.forLamb(s);
    }
}
