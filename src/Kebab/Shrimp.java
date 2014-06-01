package Kebab;

public class Shrimp extends KebabD{
    KebabD k;

    public Shrimp(KebabD _k){
        k =_k;}

    public boolean isVeggie(){
        return false;
    }

    public Object whatHolder(){
        return  k.whatHolder();
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + k + ")";
    }
}
