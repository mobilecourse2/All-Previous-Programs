import java.util.Scanner;
public class game2{
public static void main(String[] args){
	int pass=0, fail=0;
		Scanner obj=new Scanner(System.in);
		
		
				System.out.println("-------------------------------");
				System.out.println("|Q.no1: Pakistan National Game|");
				System.out.println("-------------------------------");
				System.out.println("a: Cricket");
				System.out.println("b: Football");
				System.out.println("c: Hockey");
				System.out.println("d: volly ball");
				System.out.print("Enter Your Answer = ");	
		String input=obj.nextLine();
				
						if(input.equals("hockey")){
								pass++;
									System.out.println("Right Answer");
									
						}
						else{
							fail++;
						System.out.println("Wrong Answer");
						}
						System.out.println("------------------------");
						System.out.println("|Q.no2: Your Class Name|");
						System.out.println("------------------------");
				System.out.println("a: Mobile");
				System.out.println("b: Web");
				System.out.println("c: Graphic");
				System.out.println("d: Desktop");
				System.out.print("Enter Your Answer = ");	
		String input2=obj.nextLine();
					
						if(input2.equals("mobile")){
								pass++;
									System.out.println("Right Answer");
						}
						else{
							fail++;
						System.out.println("Wrong Answer");
						}
						System.out.println("--------------------------");
						System.out.println("|Q.no3: Your Teacher Name|");
						System.out.println("--------------------------");
				System.out.println("a: Usman");
				System.out.println("b: Ahsan");
				System.out.println("c: Hassan");
				System.out.println("d: Ahmad");
				System.out.print("Enter Your Answer = ");	
		String input3=obj.nextLine();
					
						if(input3.equals("usman")){
								pass++;
									System.out.println("Right Answer");
						}
						else{
							fail++;
						System.out.println("Wrong Answer");
						}
						System.out.println("---------------------");
						System.out.println("|Q.no4: Your CR Name|");
						System.out.println("---------------------");
				System.out.println("a: Usman");
				System.out.println("b: Ahsan");
				System.out.println("c: Hassan");
				System.out.println("d: Ahmad");
				System.out.print("Enter Your Answer = ");	
		String input4=obj.nextLine();
					
						if(input4.equals("ahmad")){
								pass++;
									System.out.println("Right Answer");
						}
						else{
							fail++;
						System.out.println("Wrong Answer");
						}
						System.out.println("-----------------------------");
						System.out.println("|Q.no5: Your university Name|");
						System.out.println("-----------------------------");
				System.out.println("a: Vu");
				System.out.println("b: Fast");
				System.out.println("c: Uet");
				System.out.println("d: Pu");
				System.out.print("Enter Your Answer = ");	
		String input5=obj.nextLine();
					
						if(input5.equals("uet")){
								pass++;
									System.out.println("Right Answer");
						}
						else{
							fail++;
						System.out.println("Wrong Answer");
						}
				System.out.println("--------------------------------------------------");		
				System.out.println("| Your " +pass+ " Answer is Right Or "+fail+ " Answer is Wrong    |");
						
						if(pass>=3){
							if(pass==4){
								System.out.println("| Execelent Work                                 | ");
								
								System.out.println("--------------------------------------------------");		
							}
								System.out.println("| Pass But Need More Strugle | ");
							System.out.println("---------------------------------------------------");		
							
						}else{
							System.out.println("| Fail Please Work Hard                           | ");
							System.out.println("--------------------------------------------------");			
						}
		



}
}