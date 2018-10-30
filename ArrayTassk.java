publc class ArrayTask{

public static void main(String[]) args
{

//char[] a={'a','b','c'};


//for(int i =0; i<a.length; i++)
//{

//System.out.println(a[i]);
//}

int[] a={1,2,3};
int[] b={1,2,3};

int count =0;

if(a.length== b.length)
{
	for(int i=0; i<a.length; i++)
	{
		
		if(a[i] != b[i])
		{
			
			count=0;
			
		}
		else
			count=1;
	}
	if(count==0)
	{
	System.out.println("not equal");
}

else{
}	System.out.println("equal");
}
else
	System.out.println("not equal");


}

