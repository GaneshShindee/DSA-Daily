public class printSubarrays {

    //print subarrray
    public static void pairsInArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    //subarray sum
    public static void subArraySum(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
                sum=0;
            }
        }
        System.out.println("Minimum subArray is : "+min );
        System.out.println("Maximum subArray is : "+max );
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pairsInArray(arr);
        subArraySum(arr);
    }
}

