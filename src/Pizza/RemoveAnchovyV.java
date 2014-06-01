/**
  Created by hgz on 2014/5/16.
 */

package Pizza;

public class RemoveAnchovyV {
    PizzaD forCrust(){
        return new Crust();
    }
    PizzaD forCheese(PizzaD p){
        return new Cheese(p.removeAnchovy());
    }
    PizzaD forOlive(PizzaD p){
        return new Olive(p.removeAnchovy());
    }
    PizzaD forSausage(PizzaD p){
        return new Sausage(p.removeAnchovy());
    }
    PizzaD forAnchovy(PizzaD p){
        return p.removeAnchovy();
    }
}
