package Kebab;

public class Radish extends KebabD{
    KebabD k;

    public Radish(KebabD _k){
        k =_k;}

    public boolean isVeggie(){
        return k.isVeggie();
    }

    public Object whatHolder(){
        return  k.whatHolder();
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + k + ")";
    }
}
