package Pie;

/**
  Created by hgz on 2014/5/16.
 */
public class Topping extends PizzaPieD {
    Object t;
    PizzaPieD r;

    public Topping(Object _t, PizzaPieD _r){
        t = _t;
        r = _r;
    }

    public PizzaPieD removeAnchovy(){
        return raFn.forTopping(t,r);
    }

    public PizzaPieD removeFish(FishD f){
        return rfFn.forTopping(t,r,f);
    }

    public PizzaPieD removeInteger(Integer i){
        return riFn.forTopping(t,r,i);
    }

    public Object accept(PieVisitorI ask){
        return ask.forTopping(this);
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + t + "," + r + ")";
    }
}