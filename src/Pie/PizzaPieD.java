package Pie;

/**
  Created by hgz on 2014/5/16.
 */
public abstract class PizzaPieD {
    RemoveAnchovyV raFn = new RemoveAnchovyV();
    public abstract PizzaPieD removeAnchovy();

    RemoveFishV rfFn = new RemoveFishV();
    public abstract PizzaPieD removeFish(FishD f);

    RemoveIntegerV riFn = new RemoveIntegerV();
    public abstract PizzaPieD removeInteger(Integer i);

    public abstract PizzaPieD accept(PieVisitorI ask);

    public String toString(){
        return  "new " + getClass().getName() + "(" +  ")";
    }
}
