public class maximumSubArraySumPrefixSum {

    public static int maximumSubArraySumPrefixSum(int arr[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(maxSum<sum){
                   maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println(maximumSubArraySumPrefixSum(arr));
    }
}
