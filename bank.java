//Design a class For Bank, Bank class should support Following Operations. AP
class bankAccount{ 
    private static int nextAccountNumber = 1; 
    private String person; 
    private int number; 
    private double balance; 
    bankAccount(String p, double b){ 
    person = p;
    balance = b;
    number = nextAccountNumber;
    nextAccountNumber += 1;
    } 
    
    public int getNumber(){return number;} 
    public String getName() {return person;} 
    public double getBalance() {return balance;} 
    public void deposit(double a){balance += a;} 
   }
