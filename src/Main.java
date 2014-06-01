/**
  Created by hgz on 2014/5/15.
 */
import Pizza.*;
import Kebab.*;
import Shish.*;
import Point.*;
import Pie.*;

public class Main {
    public static void main(String args[]){
        ShishD s;
        s = new Onion(
              new Lamb(
               new Skewer()));
        KebabD k;
        k = new Shallot(
              new Radish(
                new Holder(6)));

        PizzaD p = new  Anchovy(
                    new  Anchovy(
                     new  Cheese(
                      new  Crust())));

        PointD ptc = new CartesianPt(1,2);
        PointD ptm = new ManhattanPt(3,4);

        PizzaPieD pp = new Topping(new PieAnchovy(),
                         new Topping(new PieTuna(),
                           new Topping(2,
                             new Bottom())));

        System.out.println( s );
        System.out.println( s.onlyOnions());
        System.out.println(s.isVegetarian());

        System.out.println( k );
        System.out.println(k.whatHolder());
        System.out.println(k.isVeggie());

        System.out.println( p );
        System.out.println(p.removeAnchovy());
        System.out.println(p.topAnchovywithCheese());

        System.out.println(ptc.closerToO(ptm));

        System.out.println( pp );
        System.out.println( pp.removeAnchovy() );
        System.out.println(pp.removeFish(new PieTuna()));
        System.out.println(pp.removeInteger(2));
        System.out.println( pp.accept(new RemoveObjectV(new PieTuna())) );
        System.out.println(pp.accept(new SubstV(new PieTuna(),new PieAnchovy())));

    }
}
