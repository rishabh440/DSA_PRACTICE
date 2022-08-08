class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String op= "";
        int close= n;
        int open = n;
        solve(ans , close , open , op);
        return ans;
    }
    void solve( List<String> ans , int open , int close , String op){
        if(open==0 && close==0)
        {
            ans.add(op);
            return;
        }
        if(open!=0){
       
                solve( ans , open -1 , close,  op+"(");
            }
        if(close>open){
           
            solve( ans , open , close-1 , op+")");
        }
    }
}
//  String curr = "";
//         int open = n;
//         int close = n;
        
//         List<String> list = new ArrayList<>();
        
//         solve(curr, open, close, list);
        
//         return list;
//     }
    
    
//     public void solve(String curr, int open, int close, List<String> list)
//     {
//         if(open == 0 && close == 0)
//         {
//             list.add(curr);
//             return;
            
//         }
        
//         if(open != 0)
//         {
//             solve(curr+"(", open-1, close, list);    
            
//         }
        
//         if(open < close)
//         {
            
//             solve(curr+")", open, close-1, list);
//         }
//     }
// }