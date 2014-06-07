package Pie;

/**
  Created by hgz on 2014/6/1.
 */
public class SubstV implements PieVisitorI{
    Object o;
    Object n;
    public SubstV(Object _o,Object _n){
        o = _o;
        n = _n;
    }
    public Object forBottom(Bottom that){
        return that;
    }

    public Object forTopping(Topping that){
        if(o.equals(that.t)){
            that.t = n;
            that.r.accept(this);
            return that;
        }
        else{
            that.r.accept(this);
            return that;
        }
    }
}
