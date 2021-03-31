package Assn5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }
    public String getName() { return name; }
    public int getCalories() { return calories; }
    public int getPrice() { return price; }
    public String getColor() { return color; }
}

public class Assignment5Q1 {

   public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        List<Fruit> lt = new ArrayList<>();
        for(Fruit f : fruits){
            if(f.getCalories()<100){
                lt.add(f);
            }
        }
         lt.stream().sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                                    .map(Fruit::getName)
                                    .forEach(System.out::println);
        return null;
    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
        fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .map(Fruit::getName)
                .forEach(System.out::println);
        return null;
    }

   public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
       List<Fruit> l = new ArrayList<>();
       for(Fruit f : fruits){
           if(f.getColor().equals("red")){
               l.add(f);
           }
       }
       l.stream().sorted(Comparator.comparingInt(Fruit::getPrice))
               .map(Fruit::getName)
               .forEach(System.out::println);
       return null;
   }

    public static void main(String[] args) {
        /*
         * creating FRUITS
         */
        Fruit apple = new Fruit("apple",120,250,"red");
        Fruit orange = new Fruit("orange",150,150,"Green");
        Fruit cherry = new Fruit("Mango",90,350,"Orange");
        Fruit lemon = new Fruit("Banana",40,280,"yellow");

       
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        fruitArrayList.add(apple);
        fruitArrayList.add(orange);
        fruitArrayList.add(cherry);
        fruitArrayList.add(lemon);

     
        reverseSort(fruitArrayList);
        sort(fruitArrayList);
        filterRedSortPrice(fruitArrayList);
    }

}