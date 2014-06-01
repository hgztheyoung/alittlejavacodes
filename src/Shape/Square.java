package Shape;

/**
  Created by hgz on 2014/6/1.
 */
public class Square extends ShapeD{
    int s;
    Square(int _s){
        s = _s;
    }
    public boolean accept(ShapeVisitorI ask) {
        return ask.forSquare(s);
    }
}
