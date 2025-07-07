public class KadanesAlgorithm {
    public static int KadanesAlgorithm(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-4,-2,4,-1,-2,4,1,-4};
        System.out.println(KadanesAlgorithm(arr));
    }
    
}
