package Tree;

/**
  Created by hgz on 2014/6/1.
 */
public class bHasFruitV implements bTreeVisitorI {
    public boolean forBud() {
        return false;
    }

    public boolean forFlat(FruitD f, TreeD t) {
        return true;
    }

    public boolean forSplit(TreeD l, TreeD r) {
        return l.accept(this) || r.accept(this);
    }
}
