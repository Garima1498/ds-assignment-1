import java.util.*;
class maxval 
{
  public static void main(String[] args) 
  {
    Scanner o=new Scanner(System.in);
    int n,i,j,max=0;
    System.out.println("enter the size of array");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println("max value in array is: "+max);
  }
}