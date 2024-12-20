import java.util.ArrayList;

public class Box<T extends Fruit>  {
    private String name;
    private float weight;
    private int fruitCounter;
    private ArrayList<T> fruits;

    Box(String name)
    {
        this.name = name;
        this.weight=0f;
        this.fruitCounter=0;
        this.fruits= new ArrayList<>();
    }

    public void addFruit(T fruit)
    {
      if(fruits.add(fruit))
       {
          weight += fruit.getWeight();
          fruitCounter++;
      }
    }
    public void removeFruit(T fruit)
    {
       if( fruits.remove(fruit)) {
           weight -= fruit.getWeight();
           fruitCounter--;
       }
    }
    public void emptyBox()
    {
        fruits.clear();
        weight=0f;
        fruitCounter=0;
    }
    public float getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public float getFruitsCounter() {
        return fruitCounter;
    }
    public boolean Compare(Box<? extends Fruit> box)
    {
        return (Math.abs(box.weight - this.weight) < 0.005);
    }
    public void fruitspPouring(Box<T> targetBox)
    {
        ArrayList<T> tempFruits = new ArrayList<>(this.fruits);
        for(T fruit : tempFruits)
        {
            removeFruit(fruit);
            targetBox.addFruit(fruit);
        }
    }
}
