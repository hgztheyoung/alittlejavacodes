package Tree;

import sun.reflect.generics.tree.Tree;

public class Split extends TreeD{
    TreeD l;
    TreeD r;
    Split(TreeD _l,TreeD _r){
        l = _l;
        r = _r;
    }
}
