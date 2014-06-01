package Shish;

/**
 Created by hgz on 2014/5/15.
 */

public abstract class ShishD {
    OnlyOnionsV ooFn = new OnlyOnionsV();
    public abstract boolean onlyOnions();

    IsVegetarianV ivFn = new IsVegetarianV();
    public abstract boolean isVegetarian();
}

