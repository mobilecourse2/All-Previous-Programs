import java.util.*;
public class whileloop
{
       public static void main(String args[])
         {
			
			 

			//==========================while loop================================= 
			 
			 //=========================print one to ten===========================
			/* int x = 1;
			 
			 while(x<=10)
			 {
				 System.out.println(x);
				 x++;
				 
			 }
			 */
		 	 //======================Print even between 2 to 10=====================
			 // int i=0;
			 
			/* int x = 2;
			 
			 while(x<=10)
			 {
				 
				 System.out.println(x);
				 x+=2;
				 
			 }*/
			 
			 // ============================ Print table program=======================
			/* int i=2;
			 int j = 1;
			 while(j<=10)
			 {
			 System.out.println(i + "*" + j + "=" + i*j) ;
             j++;
			 }
			 */
			 // ============================ Print even numbers between 1 to 30 program=======================
			/* int i = 1;
			 while(i<=30)
			 {
				 if(i%2 == 0)
				 {
					 System.out.println(i + " is even") ;
				 }
				 i++;
				 
			 }
			 */
			 //=============Display 1 to 10 except 5.======================
			/* int i =10;
			 while(i>=1)
			 {
				 if(i==5)
				 {
					 i--;
					 continue;
				 }
				 System.out.println(i);
				 i--;
			 }*/
			 //======================================================
			 
			/* int i =10;
			 while(i>=1)
			 {
				  
				 System.out.println(i);
				 i++;
			 }
			 */
			//====================================================================================== 
           /* int i=0;
            while(i<=5)
			{
				Scanner sc = new Scanner(System.in); 
				System.out.println("you can try only 5 times:");
				System.out.println("Enter String like..... square...,...squareformula...,...squareroot...,...cubeformula...");
				String s = sc.nextLine();
				
				switch(s)
				{
					case "square":
					System.out.println("Enter number for square");
					Scanner sc1 = new Scanner(System.in); 
					int a= sc1.nextInt();
					System.out.println("Square of"+ a+"is"+a*a);
					break;
					
					case "squareformula":
					System.out.println("Enter number for squareformula");
					Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter first number");
					int a1= sc2.nextInt();
					System.out.println("Enter Second number");
					int b1= sc2.nextInt();
					System.out.println("Square formula of (a1+b1)^2 is"+(a1*a1 + b1*b1 + 2*a1*b1));
					break;
					
					case "squareroot":
					System.out.println("Enter number for squareroot");
					Scanner sc3 = new Scanner(System.in); 
					int a2= sc3.nextInt();
					System.out.println("Squareroot of"+ a2+"is"+Math.sqrt(a2));
					break;
					
					case "cubeformula":
					System.out.println("Enter first number");
					Scanner sc4 = new Scanner(System.in);
					int a3= sc4.nextInt();
					System.out.println("Enter Second number");
            		int b3= sc4.nextInt();
		     		System.out.println("cubeformula value  of (a3+a3)^3 is"+ (((a3*a3*a3) + (b3*b3*b3) + 3*(a3 * b3)*(a3+b3))));
					break;					
				}
				
				i++;
				
			}				
*/
	
          /*  short i  = 10;
			while(i>=5)
			{
				System.out.println(i);
				i++;
				
			}
          */
  /*
			char value = 'A';
             value++;
			 System.out.println((int)value);
			
*/
/*
boolean i = true;
while(true)
{
	byte j = 0;
	j++;
	System.out.println(j);
	i = false;
	continue;
}
*/
int g = 3;   
System.out.println(++g * 8);
System.out.println("fgnfhsrththsghsh");
	}
	
}


































