import java.util.Scanner;
class Operators{


public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter first num:");
int a=sc.nextInt();
System.out.println("enter sec value:");
int b=sc.nextInt();

int c=a+b;
int d=a-b;
int e=a*b;
int f=a%b;



System.out.println("your addition is:"+c);
System.out.println("your subtraction is:"+d);
System.out.println("your multiplication is:"+e);
System.out.println("your division is:"+f);





float a, b, res=0;
int choice;

Scanner scan= new Scanner(System.in);
while(true)
{
System.out.println("1.addition");
System.out.println("2.subtract");
System.out.println("3.multiplication");
System.out.println("4.divisiion");
System.out.println("enter choice 1-4");
choice = scan.nextInt();

switch(choice){

case 1:

System.out.println("enter any  two num:");
   a = scan.nextFloat();
   b = scan.nextFloat();
   res = a+b;
   break;
 case 2:  
System.out.println("enter any two num:");
   a = scan.nextFloat();
   b = scan.nextFloat();
   res = a-b;
   break;
 case 3:  
System.out.println("enter any  two num:");
   a = scan.nextFloat();
   b = scan.nextFloat();
   res = a*b;
   break;
  case 4: 
System.out.println("enter any two num:");
   a = scan.nextFloat();
   b = scan.nextFloat();
   res = a/b;
   break;
 default:
 System.out.println("invalid choice..");
    break;
}
System.out.println("your result is "+res);



}
   }