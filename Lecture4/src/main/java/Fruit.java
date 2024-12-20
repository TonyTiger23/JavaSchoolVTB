public abstract class Fruit {
    protected String name;
    protected String color;
    protected float weight;
    protected static int counter =0;

    Fruit(String name, String color, float weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        counter++;
    }

    public int getCounter()
    {
        return counter;
    }

    public float getWeight()
    {
        return weight;
    }

}
