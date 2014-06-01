package Tree;

public class Apple extends FruitD{
    public boolean equals(Object o){
        return (o instanceof Apple);
    }
}
