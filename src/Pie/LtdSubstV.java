package Pie;

/**
  Created by hgz on 2014/6/1.
 */
public class LtdSubstV extends SubstV{
    int c;
    public LtdSubstV(int _c, Object _o, Object _n){
        super(_o, _n);
        c = _c;
    }
    public PizzaPieD forTopping(Topping that){
        if(c == 0)
            return that;
        else
            if(o.equals(that.t)) {
                that.r.accept(new LtdSubstV(c - 1, n, o));
                return that;
            }
            else{
                that.r.accept(this);
                return that;
            }
    }

}
