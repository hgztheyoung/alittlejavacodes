package Pie;

/**
  Created by hgz on 2014/6/7.
 */
public class OccursV implements PieVisitorI{
    Object a;
    OccursV(Object _a){
        a = _a;
    }
    public Object forBottom() {
        return 0;
    }

    public Object forTopping(Object t, PizzaPieD r) {
        if(t.equals(a))
            return (Integer)r.accept(this) + 1;
        else
            return r.accept(this);
    }
}
