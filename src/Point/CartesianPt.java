package Point;

public class CartesianPt extends PointD {
    public CartesianPt(int _x, int _y){
        super(_x, _y);}

    public int distanceToO(){
        return (int)Math.sqrt(x*x + y*y);
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + x +","+ y +")";
    }
}
