package Shape;

import Point.PointD;

/**
  Created by hgz on 2014/6/1.
 */
public class Translation extends ShapeD{
    PointD q;
    ShapeD s;
    Translation(PointD _q,ShapeD _s){
        q = _q;
        s = _s;
    }
    public boolean accept(ShapeVisitorI ask) {
        return ask.forTranslation(q, s);
    }
}
