
class minlengthofunsortedarray
{
 static void printunsorted(int arr[],int n)
{
 int s=0,e=n-1,i=0,max=0,min=0;
 for(s=0;s<=n-1;s++)
 {
    if(arr[s]>arr[s+1])
    break;
    
    }
 if(s==n-1)
 System.out.println("The complete array is sorted");
 
 for(e=n-1;e>=0;e--)
 {
    if(arr[e]<arr[e-1])
    break;
    
    }
 max=arr[s];
 min=arr[e];//
 for(i=s+1;i<=e;i++)
  {
    if(arr[i]>max)
    max=arr[i];
    if(arr[i]<min)
    min=arr[i];
    
    }
  for(i=0;i<s;i++)
  {
    if(arr[i]>min)
    {
    s=i;
    
    }
    
    }
  for(i=n-1;i>=e+1;i--)
  {
    if(arr[i]<max)
    {
     e=i;
     
    
    }
    
    }
    System.out.println("The unsorted sub array sorting which makes the given array sorted lies between indices"+s+"and"+e);
    
}
public static void main(String args[])
{
 int arr[]={10,12,20,30,25,40,32,31,35,50,60};
 int arr_size=arr.length;
 printunsorted(arr,arr_size);
 
   }


}