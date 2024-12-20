public class Apple extends Fruit{

    protected static int counter =0;

    Apple(String name, String color, float weight) {
        super(name, color, weight);
        counter++;
    }
    public int getCounter()
    {
        return counter;
    }
}
