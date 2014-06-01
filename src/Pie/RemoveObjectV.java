package Pie;

/**
  Created by hgz on 2014/5/31.
 */
public class RemoveObjectV implements PieVisitorI{
    Object o;
    public RemoveObjectV(Object _o){
        o = _o;
    }
    public PizzaPieD forBottom(){
        return new Bottom();
    }
    public PizzaPieD forTopping(Object t,PizzaPieD r){
        if(o.equals(t))
            return  r.accept(this);
        else
            return new Topping(t,r.accept(this));
    }
}
