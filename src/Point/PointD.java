package Point;

/**
  Created by hgz on 2014/5/15.
 */
abstract public class PointD {
    int x;
    int y;

    PointD(int _x,int _y){
        x = _x;
        y = _y;
    }
    public boolean closerToO(PointD p){
        return
          distanceToO() <= p.distanceToO();
    }
    public abstract int distanceToO();
}

