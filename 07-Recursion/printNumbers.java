
public class printNumbers {
    public static void printNumbersFun(int n){
        if(n<1) return;
        System.out.print(n+" ");
        printNumbersFun(n-1);
    }

    public static void printNumbersInc(int n){
        if(n<1) return;
        printNumbersInc(n-1);
        System.out.print(n+" ");
    }

    public static int printFactorial(int n){
        if(n==0) return 1;
        return n*printFactorial(n-1);
    }

    public static int printSumofFirstNNatural(int n){
        if(n==1) return 1;
        return n+printSumofFirstNNatural(n-1);
    }

    public static int fibonacciNumber(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }

    public static boolean sortedorNot(int arr[],int i){
        if(i==arr.length-1) return true;
        boolean ans= true;
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedorNot(arr, i+1);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,8,5};
        printNumbersFun(n);
        System.out.println();
        printNumbersInc(n);
        System.out.println();
        System.out.println(printFactorial(n));;
        System.out.println(printSumofFirstNNatural(n));
        System.out.println(fibonacciNumber(n));
        System.out.println(sortedorNot(arr,0));
    }
}
