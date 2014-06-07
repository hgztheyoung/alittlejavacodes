package Point;

/**
  Created by hgz on 2014/5/15.
 */
abstract public class PointD {
    public int x;
    public int y;

    PointD(int _x,int _y){
        x = _x;
        y = _y;
    }
    public boolean closerToO(PointD p){
        return
          distanceToO() <= p.distanceToO();
    }

    public PointD minus(PointD p){
        return new CartesianPt(x - p.x,y - p.y);
    }

    public int moveBy(int deltax,int deltay){
        x = x + deltax;
        y = y + deltay;
        return distanceToO();
    }

    public abstract int distanceToO();
}

