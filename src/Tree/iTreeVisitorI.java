package Tree;

/**
 * Created by hgz on 2014/6/1.
 */
public interface iTreeVisitorI {
    int forBud();
    int forFlat(FruitD f,TreeD t);
    int forSplit(TreeD l,TreeD r);
}