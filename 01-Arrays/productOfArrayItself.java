public class productOfArrayItself {
    public static void productArray(int arr[]){
        int res[]=new int[arr.length];
        int max=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    max=arr[j]*max;
                }
                if(max==0){
                    break;
                }
            }
            res[i]=max;
            max=1;
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,1};
        productArray(arr);
    }
}
