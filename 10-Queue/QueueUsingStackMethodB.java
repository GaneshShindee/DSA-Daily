import java.util.*;

public class QueueUsingStackMethodB {
    static class Queue{
        static Stack<Integer> s1 =new Stack<>();
        static Stack<Integer> s2 =new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }

        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            if(s2.isEmpty()){
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            if(s2.isEmpty()){
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove()); // 1
        System.out.println(q.peek());   // 2
        q.add(4);
        System.out.println(q.remove()); // 2
        System.out.println(q.remove()); // 3
        System.out.println(q.remove()); // 4
    }    
}
