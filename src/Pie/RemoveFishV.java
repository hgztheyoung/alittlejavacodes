package Pie;

/**
 * Created by hgz on 2014/5/31.
 */
public class RemoveFishV {
    PizzaPieD forBottom(FishD f){
        return new Bottom();
    }
    PizzaPieD forTopping(Object t,PizzaPieD r,FishD f){
        if(f.equals(t))
            return r.removeFish(f);
        else
            return new Topping(t,r.removeFish(f));
    }
}
