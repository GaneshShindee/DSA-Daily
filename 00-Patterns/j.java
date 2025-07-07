public class j {

    public static void findRepeatAndMissing(int arr[]){
        int temp[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        int res[]=new int[2];
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0){
                res[1]=i;
            }
            if(temp[i]==2){
                res[0]=i;
            }
        }
        System.out.println("missing number is "+res[1]);
        System.out.println("repeat number is "+res[0]);
    }
    public static void main(String[] args) {
        int arr[]={5,2,4,4,1};
        findRepeatAndMissing(arr);
    }
}
