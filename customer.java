//Write a program to create a class customer (Customer no,Customer name,Customer Number,Customer address) Write a method to search the Customer name with given contact number and display contact details

import java.util.Scanner;

import java.util.StringTokenizer;

class Customer

{

String name;

String date;

public void read()

{

Scanner input =new Scanner(System.in);

System.out.print("Enter the customer name: ");

name=input.next();

System.out.print("Enter the customer dob(dd/mm/yyyy): ");

date=input.next();

}

public void display()

{

System.out.print(name);

String delims="/";

StringTokenizer st=new StringTokenizer(date,delims);

while(st.hasMoreElements()){

System.out.print(","+st.nextElement());

}

System.out.println();

}

public static void main(String[] args)

{

System.out.println("Enter the customer details");

Customer[] cus=new Customer[30];

Scanner sc =new Scanner(System.in);

System.out.print("Enter the number of customer: ");

int n=sc.nextInt();

for(int i=0;i<n;i++)

{

cus[i]=new Customer();

cus[i].read();

}

System.out.println("Customer Details in Required Format!");

for(int i=0;i<n;i++)

cus[i].display();

}

}