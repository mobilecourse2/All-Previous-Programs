import java.util.Scanner;
class ArrayPract{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int [] b = new int[a];
for(int i=0;i<b.length;i++)
{
b[i] = scan.nextInt();
}
for(int j=0;j<b.length;j++)
{
System.out.println("output="+b[j]);
}
}
}
