package Pie;

/**
  Created by hgz on 2014/6/1.
 */
class LtdSubstV extends SubstD{
    int c;
    LtdSubstV(int _c,Object _o,Object _n){
        super(_o, _n);
        c = _c;
    }
    public PizzaPieD forTopping(Object t,PizzaPieD r){
        if(c == 0)
            return new Topping(t,r);
        else
            if(o.equals(t))
                return
                  new Topping(n,r.accept(new LtdSubstV(c-1,n,o)));
            else
                return
                  new Topping(t,r.accept(this));
    }

}
