public class k{
    public static int trappedWater(int arr[]){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        left[0]=arr[0];
        right[arr.length-1]=arr[arr.length-1];

        //left max
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1], arr[i]);
        }

        //right max
        for(int i= arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1], arr[i]);
        }

        int trappedWater=0;

        for(int i=0;i<arr.length;i++){
            trappedWater=trappedWater+(Math.min(left[i], right[i])-arr[i]);
        }

        return trappedWater;
    }
    public static void main(String[] args){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(trappedWater(arr));
    }
}