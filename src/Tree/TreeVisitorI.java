package Tree;

/**
  Created by hgz on 2014/6/1.
 */
public interface TreeVisitorI {
    Object forBud();
    Object forFlat(FruitD f,TreeD t);
    Object forSplit(TreeD l,TreeD r);
}
