package Shape;

/**
 * Created by hgz on 2014/6/6.
 */
public interface UnionVisitorI extends ShapeVisitorI {
    public boolean forUnion(ShapeD s,ShapeD t);
}
