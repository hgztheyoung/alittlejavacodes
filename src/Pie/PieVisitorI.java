package Pie;

/**
  Created by hgz on 2014/6/1.
 */
interface PieVisitorI {
    PizzaPieD forBottom();
    PizzaPieD forTopping(Object t,PizzaPieD r);
}
