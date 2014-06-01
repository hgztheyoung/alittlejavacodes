package Pie;

/**
  Created by hgz on 2014/5/31.
 */
public class RemoveIntegerV {
    PizzaPieD forBottom(Integer i){
        return new Bottom();
    }
    PizzaPieD forTopping(Object t,PizzaPieD r,Integer i){
        if(i.equals(t))
            return r.removeInteger(i);
        else
            return new Topping(t,r.removeInteger(i));
    }
}
