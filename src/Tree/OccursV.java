package Tree;

/**
  Created by hgz on 2014/6/1.
 */
public class OccursV implements TreeVisitorI{
    FruitD a;
    public OccursV(FruitD _a){
        a = _a;
    }

    public Object forBud() {
        return 0;
    }

    public Object forFlat(FruitD f, TreeD t) {
        if(f.equals(a))
            return (Integer)t.accept(this) + 1;
        else
            return t.accept(this);
    }

    public Object forSplit(TreeD l, TreeD r) {
        return (Integer)l.accept(this) + (Integer)r.accept(this);
    }
}
