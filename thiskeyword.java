//Write a program create a class person as data members as (person name,Account Number) Accept information for five object and display information. Use  this keyword
// Java program to show the class declaration 
// and how to create an instance of this class
  
// Class Declaration 
public class thiskeyword
{
    // Instance Variables
    String name;
    String config;
    int cost;
    String os;
   
    // Constructor Declaration of Class
    public thiskeyword(String name, String config,
                   int cost, String os)
    {
        this.name = name;
        this.config = config;
        this.cost = cost;
        this.os = os;
    }
   
    // method 1
    public String getName()
    {
        return name;
    }
   
    // method 2
    public String getConfig()
    {
        return config;
    }
   
    // method 3
    public int getCost()
    {
        return cost;
    }
   
    // method 4
    public String getOs()
    {
        return os;
    }
   
   
    public static void main(String[] args)
    {
      // creating object using new operator
      thiskeyword c1 = new thiskeyword("Apple","i5", 50000, "IOS");
  
      System.out.println("The company name is "+ c1.getName());
      System.out.println("The configuration  is "+ c1.getConfig());
      System.out.println("Its Cost is "+ c1.getCost());
      System.out.println("Its operating System  "+ c1.getOs());
        
    }
}
