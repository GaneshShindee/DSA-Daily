
public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            front=rear=-1;
        }

        //checked if the arr is empty
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        //checked if the queue is full
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(1+rear)%size;
            arr[rear]=data;
        }

        //to remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            int peek =arr[front];
            
            if(rear!=front){
                front=(front+1)%size;
            }else{
                rear=front=-1;
            }
            return peek;
        }

    }
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }    
}
