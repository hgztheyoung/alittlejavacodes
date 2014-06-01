package Shape;

/**
  Created by hgz on 2014/6/1.
 */
public class Circle extends ShapeD{
    int r;
    Circle(int _r){
        r = _r;
    }

    public boolean accept(ShapeVisitorI ask) {
        return ask.forCircle(r);
    }
}
