public class Pet {
     // 1. Declare INSTANCE VARIABLES
    private  String type;
    private String name;
    private int age;
    private double weight;
    private boolean isSterile;

    public Pet() {
        this.type = "dog"; // WE PICK the initial values!
        this.name = "Dogananticavious";
        this.age = 3;
        this.weight = 50.0;
        this.isSterile = true; 
    }


    public Pet(String t, String n, int a, double w, boolean iS) {
     this.type = t; // USER, picked the value for type!
     this.name = n;
     this.age = a;
     this.weight = w;  
     this.isSterile = iS;
     
    }
    

public String getType() {
    return type;
}
public String getName(){
    return name;
}
public int getage(){
    return age;
}
public double getweight(){
    return weight;
}
public boolean getisSterile(){
    return isSterile;
}
public String toString(){
    String state = "Pet[" + type + ", " + name + ", " + age + ", " + weight + "," + isSterile + "]";
    return state;
}
}
     // 2. Define CONSTRUCTOR
    
     // 3. Define METHODS (getters, toString, setters)
    
 