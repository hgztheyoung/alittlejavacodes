package Point;

/**
  Created by hgz on 2014/6/1.
 */
public class ShadowedManhattanPt extends  ManhattanPt{
    int deltax;
    int deltay;
    public ShadowedManhattanPt(int _x,
                               int _y,
                               int _deltax,
                               int _deltay) {
        super(_x, _y);
        deltax = _deltax;
        deltay = _deltay;
    }
    public int distanceToO(){
        return super.distanceToO() + deltax + deltay;
    }
}
