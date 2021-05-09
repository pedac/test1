import java.util.*;

class ReverseArray
{
public static void main(String[] ags)
{  Scanner sc=new Scanner(System.in);
  int n=5;
  int a[]={10,20,30,40,50};
  int b[]= new int[n];
  for(int i=0;i<a.length;i++)
  {
       b[n-1]= a[i];
	   n--;
  }
 
for (int x: b)
{
	System.out.println(x+" ");
}
}
}
  