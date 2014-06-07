package Pie;

/**
  Created by hgz on 2014/5/31.
 */
public class RemoveObjectV implements PieVisitorI{
    Object o;
    public RemoveObjectV(Object _o){
        o = _o;
    }
    public Object forBottom(){
        return new Bottom();
    }
    public Object forTopping(Object t,PizzaPieD r){
        if(o.equals(t))
            return  r.accept(this);
        else
            return new Topping(t, (PizzaPieD)r.accept(this));
    }
}
