package Shape;

import Point.PointD;

/**
  Created by hgz on 2014/6/1.
 */
public interface ShapeVisitorI {
    boolean forCircle(int r);
    boolean forSquare(int s);
    boolean forTranslation(PointD q, ShapeD s);
}
