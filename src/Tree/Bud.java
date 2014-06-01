package Tree;

/**
 * Created by hgz on 2014/6/1.
 */
public class Bud extends TreeD {
    public boolean accept(bTreeVisitorI ask) {
        return ask.forBud();
    }
    public int accept(iTreeVisitorI ask) { return ask.forBud(); }

    public String toString(){
        return  "new " + getClass().getName() + "(" + ")";
    }
}
