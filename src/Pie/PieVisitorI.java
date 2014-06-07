package Pie;

/**
  Created by hgz on 2014/6/1.
 */
interface PieVisitorI {
    Object forBottom();
    Object forTopping(Object t,PizzaPieD r);
}
