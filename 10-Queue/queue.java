
public class queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        //check if empty or full
        public static boolean isEmpty(){
            return rear==-1;
        }

        //add function
        public static void add(int data){
            //checked for queue id full 
            if(rear==size-1){
                System.out.println("Queue is full guys");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }

        //to remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return-1;
            }
            int front =arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //finding peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return-1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }    
}
