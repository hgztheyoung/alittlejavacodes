package Point;

/**
  Created by hgz on 2014/6/1.
 */
public class ShadowedCartesianPt extends CartesianPt{
    int deltax;
    int deltay;
    public ShadowedCartesianPt(int _x,
                        int _y,
                        int _deltax,
                        int _deltay){
        super(_x, _y);
        deltax = _deltax;
        deltay = _deltay;
    }

    public int distanceToO(){
        return super.distanceToO() + (int)Math.sqrt(deltax*deltax + deltay*deltay);
    }
}
