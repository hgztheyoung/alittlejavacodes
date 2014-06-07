package Pie;

/**
  Created by hgz on 2014/6/7.
 */
public class PiemanM implements PiemanI{
    PizzaPieD p = new Bottom();
    public int addTop(Object t){
        p = new Topping(t,p);
        return occTop(t);
    }

    public int remTop(Object t) {
        p = (PizzaPieD)p.accept(new RemoveObjectV(t));
        return occTop(t);
    }

    public int substTop(Object o, Object n) {
        p = (PizzaPieD)p.accept(new SubstV(o,n));
        return occTop(n);
    }

    public int occTop(Object o) {
        return 0;
    }

}
