public class pivotElement {

    public static boolean pairSum(int arr[],int target){
        int pivot=pivotElementIndex(arr);
        System.out.println(pivot);
        int right=pivot;
        int left=pivot-1;
        boolean ans=false;
        while(left!=right){
            int sum=arr[right]+arr[left];
            if(sum==target){
                ans= true;
                break;
            }
            if(sum>target){
                left--;
                if(left<0){
                left=arr.length-1;
                }
            }
            else{
                right++;
                if(right==arr.length){
                right=0;
                }
            }  
        }
        return ans;
    }
    public static int pivotElementIndex(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=arr[e]){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
    public static void main(String[] args) {
        int arr[]={1,5,7,9,1,1,1};
        System.out.println(pairSum(arr,16));
    }
}
