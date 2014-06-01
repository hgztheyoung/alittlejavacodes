package Pie;

/**
  Created by hgz on 2014/5/31.
 */
public class RemoveAnchovyV {
     PizzaPieD forBottom(){
        return new Bottom();
    }
        PizzaPieD forTopping(Object t,PizzaPieD r){
        if(new PieAnchovy().equals(t))
            return r.removeAnchovy();
        else
            return new Topping(t,r.removeAnchovy());
    }
}
