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
    public Object forBottom(){
        return new Bottom();
    }

    public Object forTopping(Object t,PizzaPieD r){
        if(o.equals(t)){
            return new Topping(n, (PizzaPieD) r.accept(this));
        }
        else{
            return new Topping(t, (PizzaPieD) r.accept(this));
        }
    }
}
