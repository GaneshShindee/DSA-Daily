import java.util.*;
public class trial {

    public static void main(String[] args) {
        String s="Mahesh";
        int arr[]=new int[128];
        Arrays.fill(arr,-1);
        int left=0,right=0;
        int max=0;

        while(right<s.length()){
            if(arr[s.charAt(right)] != -1){
                if(arr[s.charAt(right)]>=left){
                    left=arr[s.charAt(right)]+1;
                }
            }
            max=Math.max(max, right-left+1);
            arr[s.charAt(right)]=right;
            right++;
        }

        System.out.println(max);
    }
}