package Shish;

public class Skewer extends ShishD  {

    public boolean onlyOnions(){
        return ooFn.forSkewer();
    }
    public boolean isVegetarian(){
        return  ivFn.forSkewer();
    }
    public String toString(){
        return  "new " + getClass().getName() + "(" + ")";
    }
}
