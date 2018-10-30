import java.util.Scanner;
public class TaskArray
{
public static void main(String args[]){

/*
int a,count=0;
Scanner scan = new Scanner(System.in);
a = scan.nextInt();
int[] arr = new int[a];
for(int i=0;i<arr.length;i++)
{
arr[i] = scan.nextInt();
if(arr[i] == -1){

break;
}
count=count+1;
}
 for(int j = 0;j<count;j++)
{
	
 
System.out.println("Result:"+arr[j]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
}
 */
        int array1[] = {2,3,4};
        int array2[]  ={5,6,7};
        
        int sumArray[] = new int [array1.length+array2.length];

            int vol=0;
            
            for(int j=0;j<array1.length;j++){
                sumArray[j] = array1[j];
            }
            
            for(int i=array1.length;i<sumArray.length;i++){
                sumArray[i]=array2[vol];
                vol++;
            }
            
            for(int loop = 0;loop<sumArray.length;loop++){
                System.out.print(sumArray[loop]+" ");
            }
 
 
}
}
                        