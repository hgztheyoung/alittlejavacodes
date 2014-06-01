package Pie;

/**
  Created by hgz on 2014/6/1.
 */
public class SubstV extends SubstD{
    public SubstV(Object _o,Object _n){
        o = _o;
        n = _n;
    }
    public PizzaPieD forTopping(Object t,PizzaPieD r){
        if(o.equals(t)){
            return new Topping(n,r.accept(this));
        }
        else{
            return new Topping(t,r.accept(this));
        }
    }
}
