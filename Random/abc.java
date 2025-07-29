import java.util.*;

public class abc {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int palindrome(int num){
        int arr[]= new int[10];
        int value=num%10;
        while(num>0){
            value= num%10;
            arr[value]++;
            num=num/10;
        }
        printArray(arr);
        System.out.println();
        
        return num;
    }
    public static void main(String[] args) {
        int num=8199;
        System.out.println(palindrome(num));
    }
}
