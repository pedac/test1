import java.util.*;

class Max
{
public static void main(String[] ags)
{  Scanner sc=new Scanner(System.in);
  
  int a[]=new int[3];
  for(int i=0;i<3;i++)
  {
   a[i]=sc.nextInt();
  }
 
  int max=a[0];
  for(int i=0;i<3;i++)
  { 
    
    if(a[i]>max)
     max=a[i];
 }
 System.out.println(" max from the Array is :"+max);
}
}