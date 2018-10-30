







class printArray{
public static void main(String args[]){

int [] arr  = {2,4,5,6,7,8,9,10};
for(int i = 0;i<arr.length;i++)
{
System.out.print(arr[i]+"  ");
}
}
}


//////////////////////////////////////
class reverse_Array{
	public static void main(String args[])
	{
	int [] arr  = {2,4,5,6,7,8,9,10};
	//int [] arr1 = new int[arr.length];
	//int d = 7;
for(int i = arr.length-1;i>=0;i--)
{
	//arr1[i] = arr[d];
	
System.out.print(arr[i]+"  ");
 
}
	}
}	
////////////////////////////////////////
class compare_Array{
	public static void main(String args[])
	{
	int [] arr  = {2,4,5,6,7,8,9,10};
	int [] arr1  ={2,4,5,7,7,8,9,10};
	  int a = arr[0];
	  int b = arr1[0];
 for(int i = 0;i<arr.length;i++)
 {
	 a =a+ arr[i];
 }
 for(int i = 0;i<arr1.length;i++)
 {
	b =b+ arr1[i];  
 }
	if(a==b){
	System.out.print("equal");
	}
	else{
		System.out.print("not equal");
}
	}
	}
 ////////////////////////////////////////
class sum_Array{
	public static void main(String args[])
	{
		int sum = 0;
	int [] arr  = {2,4,5,6,7,8,9,10};
	
for(int i = 0;i<arr.length;i++)
{
System.out.print(arr[i]+"  ");
sum = sum+arr[i];
}
System.out.print("\n Sum:"+sum);
	}
}	
/////////////////////////////////////////
class minMax_Array{
	public static void main(String args[])
	{
	 
	int [] arr  = {2,4,5,6,7,8,9,10};
	int a = arr[0];
 for(int i =0;i<arr.length;i++)
 {
	 
	   if(a>arr[i])
	   {
		   a = arr[i];
	   }
 
 }
  System.out.println("max"+a);
  
 for(int i =0;i<arr.length;i++)
 {
	 
	   if(a<arr[i])
	   {
		   a = arr[i];
	   }
 
 }
 System.out.println("min"+a);
  
	}
}
