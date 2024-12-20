public class Orange extends Fruit{
    protected static int counter =0;

    Orange(String name, String color, float weight) {
        super(name, color, weight);
        counter++;
    }
    public int getCounter()
    {
        return counter;
    }
}
