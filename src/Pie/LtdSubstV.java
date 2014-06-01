package Pie;

import java.security.PublicKey;

/**
  Created by hgz on 2014/6/1.
 */
class LtdSubstV extends SubstD{
    int c;
    LtdSubstV(int _c,Object _n,Object _o){
        c = _c;
        n = _n;
        o = _o;
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
