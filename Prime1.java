# Prime1
import java.util.*;
import java.io.*;
public class Prime1
{
  public static void main(String args[])
  {
    int a=0; 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    for(int i=n;i<=m;i++)
    {
      for(int j=2;j<i;j++)
      {
          if(i%j==0)
        {
          a=0; 
          break;
                }
                else
                a=1;
        }
      if(a==1)
      {
        System.out.println(i);
      }
    }
    
       
  }
  
}
