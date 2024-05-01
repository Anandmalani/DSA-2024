class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListImp{
    Node head;
    public Node addNodeLast(Node node){
        if(head==null){
            head=node;
            return head;
        }
        Node a=head;
        while(a.next!=null){
            a=a.next;
        
        }
        a.next=node;
        return head;

    }
    public void printData(){
        Node a=head;
        while(a!=null){
            System.out.println(a.data);
            a=a.next;
        }

    }

    public static void main(String[] args) {
        LinkedListImp ll=new LinkedListImp();
        ll.addNodeLast(new Node(2));
        ll.addNodeLast(new Node(5));
        ll.printData();


        
    }
}