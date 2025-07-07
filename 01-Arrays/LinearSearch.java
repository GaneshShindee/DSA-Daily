public class LinearSearch {

    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={5,56,26,5,6,8,10,6,65};
        int key=10;
        System.out.println(linearSearch(numbers, key));

    }
}
