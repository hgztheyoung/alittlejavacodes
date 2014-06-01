package Tree;

/**
 * Created by hgz on 2014/6/1.
 */
public class Flat extends TreeD{
    FruitD f;
    TreeD t;
    public Flat(FruitD _f, TreeD _t){
        f = _f;
        t = _t;
    }

    public boolean accept(bTreeVisitorI ask) {
        return ask.forFlat(f,t);
    }
    public int accept(iTreeVisitorI ask) { return ask.forFlat(f,t); }

    public Object accept(TreeVisitorI ask) {
        return ask.forFlat(f,t);
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + f +","+ t + ")";
    }
}
