package Tree;

public class Split extends TreeD{
    TreeD l;
    TreeD r;
    public Split(TreeD _l,TreeD _r){
        l = _l;
        r = _r;
    }

    public boolean accept(bTreeVisitorI ask) {
        return ask.forSplit(l,r);
    }
    public int accept(iTreeVisitorI ask){return ask.forSplit(l,r);}

    public Object accept(TreeVisitorI ask) {
        return ask.forSplit(l,r);
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + l +","+ r + ")";
    }
}
