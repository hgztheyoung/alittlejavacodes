package Shape;

import Point.PointD;

/**
  Created by hgz on 2014/6/6.
 */
public class UnionHasPtV
        extends HasPtV
        implements UnionVisitorI{
    UnionHasPtV(PointD _p){
        super(_p);
    }
    ShapeVisitorI newHasPt(PointD p){   //override
        return new UnionHasPtV(p);
    }

    public boolean forUnion(ShapeD s,ShapeD t){
        return s.accept(this) || t.accept(this);
    }
}
