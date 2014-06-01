package Shish;

public class Tomato extends ShishD {
    ShishD s;

    public Tomato(ShishD _s){
        s = _s;}

    public String toString(){
        return  "new " + getClass().getName() + "(" + s + ")";
    }

    public boolean onlyOnions(){
        return ooFn.forTomato(s);
    }
    public boolean isVegetarian(){
        return  ivFn.forTomato(s);
    }
}
