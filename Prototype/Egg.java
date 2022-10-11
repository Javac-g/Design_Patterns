package Prototype;

public class Egg {
    private int weight = 20;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Egg egg = new Egg();
        egg.setWeight(this.getWeight());
        return egg;
    }

    @Override
    public String toString() {
        return "Egg{" +
                "weight=" + weight +
                '}';
    }
}
