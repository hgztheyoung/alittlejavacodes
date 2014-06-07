package Pie;

/**
  Created by hgz on 2014/6/7.
 */
public class OccursV implements PieVisitorI{
    Object a;
    OccursV(Object _a){
        a = _a;
    }
    public Object forBottom(Bottom that) {
        return 0;
    }

    public Object forTopping(Topping that) {
        if(that.t.equals(a))
            return (Integer)that.r.accept(this) + 1;
        else
            return that.r.accept(this);
    }
}
