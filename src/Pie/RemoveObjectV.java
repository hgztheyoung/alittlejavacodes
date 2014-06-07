package Pie;

/**
  Created by hgz on 2014/5/31.
 */
public class RemoveObjectV implements PieVisitorI{
    Object o;
    public RemoveObjectV(Object _o){
        o = _o;
    }
    public Object forBottom(Bottom that){
        return new Bottom();
    }
    public Object forTopping(Topping that){
        if(o.equals(that.t))
            return  that.r.accept(this);
        else
            return new Topping(that.t, (PizzaPieD)that.r.accept(this));
    }
}
