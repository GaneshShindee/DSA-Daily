public class BinarySearch {

    public static int binarySearch(int arr[],int key){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        int key=9;
        System.out.println(binarySearch(arr, key));
    }
}
