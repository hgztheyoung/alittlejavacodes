package Kebab;

public class Holder extends KebabD{
    Object o;

    public Holder(Object _o){
        o =_o;}

    public boolean isVeggie(){
        return true;
    }

    public Object whatHolder(){
        return  o;
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + o + ")";
    }
}
