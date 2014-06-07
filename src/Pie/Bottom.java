package Pie;

/**
  Created by hgz on 2014/5/16.
 */
public class Bottom extends PizzaPieD {
    public PizzaPieD removeAnchovy() {
        return raFn.forBottom();
    }
    public PizzaPieD removeFish(FishD f){
        return rfFn.forBottom(f);
    }
    public PizzaPieD removeInteger(Integer i){
        return riFn.forBottom(i);
    }

    public Object accept(PieVisitorI ask){
        return ask.forBottom();
    }
}
