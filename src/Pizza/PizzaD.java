/**
  Created by hgz on 2014/5/15.
 */
package Pizza;

public abstract class PizzaD {
    RemoveAnchovyV remFn = new RemoveAnchovyV();
    TopAnchovywithCheeseV topFn = new TopAnchovywithCheeseV();
    public abstract  PizzaD removeAnchovy();
    public abstract  PizzaD topAnchovywithCheese();
}

