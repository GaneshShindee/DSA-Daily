
public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;//by default it initializes null to non declared object
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void printLL(){
        if(head==null){
            System.out.println("Empty Linked List");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public int removeFirst(){
        if(size==0){
            System.out.println("Empty size");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            size--;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Empty Linked List");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val= head.data;
            size--;
            head=tail=null;
            return val;
        }
        int i=0;
        Node temp = head;
        for(;i<size-2;i++){
            temp=temp.next;
        }
        int val= tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }

    public int linearSearch(int val){
        if(size==0) return -1;
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }

    public int helperFunction(Node head,int key){
        if(head==null) return -1;
        if(head.data == key) return 0;
        int ans=helperFunction(head.next, key);
        if(ans==-1) return -1;
        return ans+1;
    }

    public int recSearch(int key){
        return helperFunction(head,key);
    }
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL();
        ll.addLast(0);
        ll.printLL();
        ll.add(2, 3);
        ll.printLL();
        ll.removeLast();
        ll.printLL();
        ll.removeFirst();
        ll.printLL();
        System.out.println(ll.linearSearch(1));
        System.out.println(ll.recSearch(1));
    }    
}
