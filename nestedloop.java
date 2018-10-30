public class nestedloop {
   public static void main(String[] args) {
      
    /*  int rows = 5;
      
      for(int i = 1; i <= rows; i++)
      {
          for(int j = 1; j <= i; j++)
          {
             System.out.print(j + " ");
          }
          System.out.println("");
      }
   */
  

/*  for (int i = 1; i <= 6; i++) 
   {
      for (int j = 1; j <= i; j++) 
	  {
            System.out.print("*");
      }
            System.out.println();
   
   }*/
   /*
   for(int i=0; i<3; i++){ 
			for(int j=0; j<5; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
    */

	/*	int i, j, k, space=10;
      
      for(i=0; i<10; i++)
      {
          for(k=0; k<space; k++)
          {
              System.out.print(" ");
          }
          
          for(j=0; j<i; j++)
          {
              System.out.print("* ");
          }
          System.out.println();
          
          space--;
      }

*/
	/*	int i, j, n=1;
        for(i=1; i<5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(n+ " ");
                n++;
            }
            System.out.println();
        }
         
         
    */  

    int i=0;
	while(i<=5)
	{
		if(i==3)
			{ 
				i++; 
				break;
			
			}
		
		System.out.println(i);
		i++;
	}
	

	
       
}

}


//==================================================


