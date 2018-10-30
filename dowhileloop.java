import java .util.Scanner;
public class dowhileloop
{
       public static void main(String args[])
         {
               int count = 0;
               

	 do{
				System.out.println("Guess Character");
               Scanner sc = new Scanner(System.in);
               String aa = sc.nextLine();
               if(aa.equals("i"))

{

System.out.println("Congratulation: Your tukka is perfect");
count=6;

}

else
{
count = count+1;
switch (count)
{
	case 1:
	    System.out.println("Your are not master in guessing.");
		System.out.println(" Four tries left");
		continue;
	case 2:
	System.out.println("Your are not master in guessing.");
		System.out.println("Three Tries left");
		 continue;
	case 3:
	System.out.println("Your are not master in guessing.");
		System.out.println("Two tries left");
		 continue;
	case 4:
	System.out.println("Your are not master in guessing.");
		System.out.println("one try left");
		 continue;
	 
	
} 


}


}while(count<=5);	


}


}