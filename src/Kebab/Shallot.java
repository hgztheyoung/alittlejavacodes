package Kebab;

public class Shallot extends KebabD{
    KebabD k;

    public Shallot(KebabD _k){
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
