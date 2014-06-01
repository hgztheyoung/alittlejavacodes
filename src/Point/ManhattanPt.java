package Point;

public class ManhattanPt extends PointD{
    public ManhattanPt(int _x, int _y){
        super(_x, _y);}

    public int distanceToO(){
        return  x + y;
    }

    public String toString(){
        return  "new " + getClass().getName() + "(" + x +","+ y +")";
    }
}
