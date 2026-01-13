public class Main {
     public static void main(String[] args) {
         // CREATE 2 Pet objects with different initial values
         Pet dog = new Pet("dog", "cat", 3, 50.0, true);
         Pet cat = new Pet("cat", "dog", 50, 3.0, false);
         // TEST all Pet methods (getters, toString, setters)
         System.out.println(dog);
         System.out.println(cat);
    
     }
 }