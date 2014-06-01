/**
 Created by hgz on 2014/5/16.
 */

package Pizza;

public class TopAnchovywithCheeseV {
    PizzaD forCurst(){
        return new Crust();
    }
    PizzaD forCheese(PizzaD p){
        return new Cheese(p.topAnchovywithCheese());
    }
    PizzaD forOlive(PizzaD p){
        return new Olive(p.topAnchovywithCheese());
    }
    PizzaD forSausage(PizzaD p){
        return new Sausage(p.topAnchovywithCheese());
    }
    PizzaD forAnchovy(PizzaD p){
        return new Cheese(new Anchovy(p.topAnchovywithCheese()));
    }
}
