import java.util.*;
class intersection 
{
  public static void main(String[] args) 
  {
    Scanner b=new Scanner(System.in);
    int a,i,j,max=0,k=0,c;
    System.out.println("enter the size of array 1");
    a=b.nextInt();
    int arr[]=new int[a];
    System.out.println("enter elements of array 1");
    for(i=0;i<a;i++)
    {
      arr[i]=b.nextInt();
    }
    System.out.println("enter the size of array 2");
    c=b.nextInt();
    int arr1[]=new int[c];
    System.out.println("enter elements of array 2");
    for(i=0;i<c;i++)
    {
      arr1[i]=b.nextInt();
    }
    int arr2[]=new int[20];
for(i=0;i<a;i++)
    {
      for(j=0;j<c;j++)
      {
        if((arr[i]==arr1[j])&&(arr[i]!=-1)&&(arr1[j]!=-1))
        {
          arr2[k]=arr[i];
          k++;
          
          arr[i]=-1;
          arr1[j]=-1;
        }
      }
    }

    for(i=0;i<k;i++)
    {
      for(j=0;j<k-i-1;j++)
      {
        if(arr2[j]>arr2[j+1])
        {
          arr2[j]=arr2[j]^arr2[j+1];
          arr2[j+1]=arr2[j]^arr2[j+1];
          arr2[j]=arr2[j]^arr2[j+1];
        }
      }
      
    }
    System.out.println("final array:");
    for(i=0;i<k;i++)
    {
      System.out.print(arr2[i]+" ");
    }
    
  }
}