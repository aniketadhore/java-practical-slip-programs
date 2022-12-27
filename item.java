import java.util.Scanner;
public class Item
 {
int no;
String name;
String price;

static int numberofobjects=0;
Item(){
no=0;
name="";
price="0";

}
Item(int id,String name,String deptname,float salary ){
public void display(){
System.out.println("Item no :"+no);
System.out.println("Item name: "+name);
System.out.println("Item price: "+price);
System.out.println();
}
public static void main(String[] args){
int n=0;
Scanner sc=new Scanner(System.in);
System.out.print("How many item you want to enter :");
n=sc.nextInt();
Item[] ob=new Item[n];
for(int i=0;i<n;i++){
sc= new Scanner(System.in);
System.out.println("Enter number of item "+(i+1)+" :");
int id=sc.nextInt();
System.out.println("Enter Name of item "+(i+1)+" :");
sc.nextLine();
String name= sc.nextLine();
System.out.println("Enter price of item "+(i+1)+" :");
String deptname=sc.nextLine();
ob[i]=new Item(no,name,price);
System.out.println("\nNumber of Objects : "+numberofobjects);

}
for(int i=0;i<n;i++)
{
ob[i].display();
}
}
}