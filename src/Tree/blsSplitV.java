package Tree;

/**
 * Created by hgz on 2014/6/1.
 */
public class blsSplitV implements bTreeVisitorI {

    public boolean forBud() {
        return true;
    }

    public boolean forFlat(FruitD f, TreeD t) {
        return false;
    }

    public boolean forSplit(TreeD l, TreeD r) {
        return
          l.accept(this) && r.accept(this);
    }
}
