import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String args[]){
        System.out.println(combine(4,2));

    }
    public static void backtract(List<List<Integer>> ans, List<Integer> list , int n, int k, int s){
            if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
            }

            for(int i=s;i<n;i++){
            // if(list.contains(i+1)){
            // continue;
            // }
            list.add(i+1);
            backtract(ans,list,n,k,s++);
            list.remove(list.size()-1);
            }
            }
    public static List<List<Integer>> combine(int n, int k) {
            List<Integer> list=new ArrayList<Integer>();
            List<List<Integer>> ans=new ArrayList<>();
            backtract(ans,list,n,k,0);
            return ans;
            }
            }