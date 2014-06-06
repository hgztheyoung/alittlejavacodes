package Shape;

import Point.PointD;

/**
  Created by hgz on 2014/6/1.
 */
public class HasPtV implements ShapeVisitorI {
    PointD p;
    public HasPtV(PointD _p){
        p = _p;
    }
    ShapeVisitorI newHasPt(PointD p){
        return new HasPtV(p);
    }

    public boolean forCircle(int r) {
        return p.distanceToO() <= r;
    }

    public boolean forSquare(int s) {
        return (p.x <= s) && (p.y <= s);
    }

    public boolean forTranslation(PointD q, ShapeD s) {
        return s.accept(newHasPt(p.minus(q)));
    }
}
