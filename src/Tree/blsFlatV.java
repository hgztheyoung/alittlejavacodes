package Tree;

/**
 * Created by hgz on 2014/6/1.
 */
public class blsFlatV implements bTreeVisitorI {
    public boolean forBud(){
        return true;
    }
    public boolean forFlat(FruitD f,TreeD t){
        return t.accept(this);
    }
    public  boolean forSplit(TreeD l,TreeD r){
        return  false;
    }
}
