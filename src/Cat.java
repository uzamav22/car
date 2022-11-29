import static java.lang.Math.*;
public class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String toString(){
        return weight+", "+name+", "+age+", "+color;
    }
    void meow() {
        System.out.println("Meow");
    }
    private void pee() {
        weight -= 20;
    }
    private void eat() {
        weight += 50;
        if(50/weight>0.01)
            pee();
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}