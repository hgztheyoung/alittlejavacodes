package Shape;

/**
  Created by hgz on 2014/6/6.
 */
public class Union extends ShapeD{
    ShapeD s;
    ShapeD t;
    Union(ShapeD _s,ShapeD _t){
        s = _s;
        t = _t;
    }

    public boolean accept(ShapeVisitorI ask){
        return ((UnionVisitorI)ask).forUnion(s,t);
    }
}
