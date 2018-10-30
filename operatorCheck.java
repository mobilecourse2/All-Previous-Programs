
import java.util.Scanner;

public class operatorCheck

{



 public static void main(String args[])

{

int result = 0;


System.out.println("You can do your desire function:");


Scanner obj = new Scanner(System.in);
System.out.println("Enter First number");
int num1 = obj.nextInt();
System.out.println("Enter Second number");
int num2 = obj.nextInt();
System.out.println("Enter operator tou want to to operate");
char op = obj.next().charAt(0);

switch(op)

{
   case '+':
   result = num1 + num2;
   System.out.println(result);
   break;

   case '-':
    result = num1 - num2;
   System.out.println(result);
   break;  
   case '/':
   result = num1 / num2;
   System.out.println(result);
   break;
   case '*':
   result = num1 * num2;
   System.out.println(result);
   break;
   default:
   System.out.println("invalid");

}






}



}