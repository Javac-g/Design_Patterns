package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Chicken implements Cloneable {
    private int weight = 200;
    private Egg egg;
    private List<Egg> eggs = new ArrayList<>();

    public Chicken() {
    }

    public Chicken(Chicken chicken) throws CloneNotSupportedException {
        this.weight = chicken.getWeight();
        this.setEgg((Egg)chicken.getEgg().clone());
        ArrayList<Egg> list = new ArrayList<>();
        for (Egg x : chicken.eggs){
            list.add((Egg)x.clone());
        }
        this.setEggs(list);
    }


    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Egg> getEggs() {
        return eggs;
    }

    public void setEggs(List<Egg> eggs) {
        this.eggs = eggs;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Chicken chicken = new Chicken();
        chicken.setWeight(this.getWeight());
        chicken.setEgg((Egg)this.getEgg().clone());
        ArrayList<Egg> list = new ArrayList<>();
        for (Egg x : this.eggs){
            list.add((Egg)x.clone());
        }
        chicken.setEggs(list);
        return chicken;

    }

    @Override
    public String toString() {
        return "Chicken{" +
                "weight=" + weight +
                ", egg=" + egg +
                ", eggs=" + eggs +
                '}';
    }
}
