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
    void func( int indx, int sum , ArrayList<Integer> arr , int N , ArrayList<Integer> sumsubsets){
        if(indx == N){
            sumsubsets.add(sum);
            return ;
            
        }
        func(indx+1 , sum+ arr.get(indx) , arr , N , sumsubsets);
        func(indx+1 , sum , arr , N , sumsubsets);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> sumsubsets = new ArrayList<>();
        func(0,0,arr,N,sumsubsets);
        Collections.sort(sumsubsets);
        return sumsubsets;
    }
}