//Q13.Define an Employee class with suitable attributes having getSalary() method, which returns salary withdrawn by a particular employee. Write a class Manager which extends a class Employee, override the getSalary() method, which will return salary of manager by adding traveling allowance, house rent allowance
import java.util.*;
import java.io.*;
class Employee
{
      String nm;
      int id;
      float sal;
      void accept()
      {
            System.out.println("Enter id & name");
            Scanner s=new Scanner(System.in);
            id=s.nextInt();
            nm=s.next();
      }
            float getsalary()
      {
            System.out.println("Enter salary");
            Scanner s=new Scanner(System.in);
            sal=s.nextFloat();
            return sal;
      }
}
class Manager extends Employee
{    
      int ta,hr;
      float s1;
      float getsalary()
      {
            super.accept();
            s1=super.getsalary();
            System.out.println("Enter travelling allownces & house rent");
            Scanner s=new Scanner(System.in);
            ta=s.nextInt();
            hr=s.nextInt();
            System.out.println("Salary after adding="+(s1+ta+hr));
            return s1+ta+hr;
      }
            void display()
      {
            float a=getsalary();
                  }
}
class Slip25
{
      public static void main(String a[])
      {
            Manager ob=new Manager();
            ob.display();
      }
}