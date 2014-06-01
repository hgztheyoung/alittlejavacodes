package Shish;

public class Onion extends ShishD {
    ShishD s;

    public Onion(ShishD _s){
        s = _s;}

    public String toString(){
        return  "new " + getClass().getName() + "(" + s + ")";
    }
    public boolean isVegetarian(){
        return  ivFn.forOnion(s);
    }
    public boolean onlyOnions(){
        return ooFn.forOnion(s);
    }
}
