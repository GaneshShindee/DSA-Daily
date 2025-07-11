import java.util.*;
public class pushAtBottom {
    public static void pushAtBottom(Stack<Integer> s,int n){
        if(s.isEmpty()) {
            s.push(n);
            return;
        }
        
        int top=s.pop();
        pushAtBottom(s, n);
        s.push(top);
    }

    public static String reverseStringUsingStack(String s){
        Stack<Character> c= new Stack<>();
        for(int i=0;i<s.length();i++){
            c.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!c.isEmpty()){
            sb.append(c.pop());
        }
        return sb.toString();
    }


    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        pushAtBottom(s,4);
        
        String name= "ganesh";
        System.out.println(name);
        name=reverseStringUsingStack(name);
        System.out.println(name);
        reverseStack(s);
        printStack(s);
    }
}
