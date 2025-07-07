import java.util.*;
public class commonPrefix {
    public static void main(String[] args) {
        String strs[] = {"ganesh","ramesh","mahesh","sambha","baburao"};
        for(int i=0;i<strs.length;i++){
            System.out.print(strs[i]+" ");
        }
        System.out.println();
        Arrays.sort(strs);
        for(int i=0;i<strs.length;i++){
            System.out.print(strs[i]+" ");
        }
    }
}
