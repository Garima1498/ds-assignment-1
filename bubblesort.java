  import java.util.*;
class bubblesort
{
  public static void main(String[] args) 
  {
    Scanner b=new Scanner(System.in);
    int a,i,j,max=0;
    System.out.println("enter the size of array");
    a=b.nextInt();
    int arr[]=new int[a];
    System.out.println("enter elements of array");
    for(i=0;i<a;i++)
    {
      arr[i]=b.nextInt();
    }
    
    for(i=0;i<a;i++)
    {
      for(j=0;j<a-i-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          arr[j]=arr[j]^arr[j+1];
          arr[j+1]=arr[j]^arr[j+1];
          arr[j]=arr[j]^arr[j+1];
        }
      }
    }
System.out.println("Sorted array:");
    for(i=0;i<a;i++)
    {
      System.out.print(arr[i]+" ");
    }
    
  }
}