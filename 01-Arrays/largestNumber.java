public class largestNumber {

    public static int largestNumber(int numbers[]){
        int num=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>num){
                num=numbers[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int numbers[]={10,25,56,5,6,5,965,6,5,95,9,9};
        System.out.println(largestNumber(numbers));
    }
}
