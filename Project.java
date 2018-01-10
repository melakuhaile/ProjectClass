public class Project {
    private String name;
    private String description;
    private double initialCost;


// setter method for name 
 public void setName(String name){
    this.name = name;
}

// getter, get the name
public String getName(){
    return name;
}
// setter method description
public void setDescription(String desc){
    description = desc;
}
// getter, get descriptipon
public String getDescription(){
    return description;
}
 
// setter method for cost
 public void setInitialCost(double cost){
     initialCost = cost;
 }
    // getter, get cost
    public double getInitialCost(){
     return initialCost;
 }
 
 // Overload the constructor method in three different ways
 // default constructor, one parameter and two parameter
 
 public Project(){
 }
 
 public Project(String name){
     this.name = name;
 }
 
 public Project(String name, String desc){
     this.name = name;
     description = desc;
 }
 //Create an instance method called elevatorPitch that will return the name, initialCost and description separated by a colon.
 public String elevatorPitch(){
     return name + "(" + initialCost + "): " + description;
 }
 
 }
 

