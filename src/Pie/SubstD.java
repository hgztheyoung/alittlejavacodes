package Pie;

/**
 * Created by hgz on 2014/6/1.
 */
abstract public class SubstD implements PieVisitorI{
    Object n;
    Object o;
    SubstD(Object _o,Object _n){
        o = _o;
        n = _n;
    }
    public PizzaPieD forBottom(){
        return new Bottom();
    }
    abstract public PizzaPieD forTopping(Object t,PizzaPieD r);
}
