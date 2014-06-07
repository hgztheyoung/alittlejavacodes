package Pie;

/**
  Created by hgz on 2014/6/1.
 */
interface PieVisitorI {
    Object forBottom(Bottom that);
    Object forTopping(Topping that);
}
