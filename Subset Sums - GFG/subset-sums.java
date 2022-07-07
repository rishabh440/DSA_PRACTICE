// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
       ArrayList<Integer> subans= new ArrayList<>();
       int sum=0;
       func(subans , 0 , N , arr , sum);
       Collections.sort(subans);
       return subans;
    }
  void  func(  ArrayList<Integer> subans , int indx , int n , ArrayList<Integer> arr , int sum){
        if(n==indx){
            subans.add(sum);
            return;
        }
        func(subans , indx+1 , n , arr , sum + arr.get(indx));
         func(subans , indx+1 , n , arr , sum);
    }
}