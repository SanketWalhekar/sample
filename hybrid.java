import java.util.*;
class Student
{
int Roll_no;
void display_roll_no()
{
Scanner s1= new Scanner(System.in);
System.out.println("Enter your Roll no:");
Roll_no=s1.nextInt();
System.out.println("\nRoll No of student"+ Roll_no);
}
}
interface Sport
{
double smarks=5;
void display_smarks();
}
class Test extends Student
{
Scanner sc=new Scanner(System.in);
double marks1,marks2;
void getmarks()
{
System.out.println("Enter Marks 1");
marks1=sc.nextDouble();
System.out.println("Enter Marks 2");
marks2=sc.nextDouble();
}


}
class Result extends Test implements Sport
{
public void display_smarks()
{
System.out.println("sport marks"+smarks);
}
void Display(){
double tmarks=marks1+marks2+smarks;
System.out.println("Your Total Marks is"+tmarks);

}

}
class hybrid
{
public static void main(String [] args)
{
Result r1=new Result();
r1.display_roll_no();
r1.display_smarks();
r1.getmarks();

r1.Display();
}
}
