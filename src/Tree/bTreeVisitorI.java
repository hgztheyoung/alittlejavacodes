package Tree;

/**
 * Created by hgz on 2014/6/1.
 */
public interface bTreeVisitorI {
    boolean forBud();
    boolean forFlat(FruitD f,TreeD t);
    boolean forSplit(TreeD l,TreeD r);
}
