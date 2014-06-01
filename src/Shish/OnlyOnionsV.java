package Shish;

/**
  Created by hgz on 2014/5/16.
 */
public class OnlyOnionsV {
    boolean forSkewer(){
        return true;
    }
    boolean forOnion(ShishD s){
        return s.onlyOnions();
    }
    boolean forLamb(ShishD s){
        return false;
    }
    boolean forTomato(ShishD s){
        return false;
    }
}
