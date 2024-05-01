
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Ques3{
    Node head;
    public Node addLast(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            return head;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
        return head;
    

    }
    public void removeDublicate(Node head){
        Node a=head;
        while(a.next!=null){
            
            while(a.next.data==a.data){
                a.next=a.next.next;
            }
            a=a.next;
        }

    }
    


    public static void main(String args[]){
        Ques3 linkedList=new Ques3();
        linkedList.addLast(1);
        linkedList.addLast(1);
        linkedList.addLast(3);
        linkedList.removeDublicate(linkedList.head);
        Node a=linkedList.head;
        while(a!=null){
            System.out.print(a.data+" ");
            a=a.next;

        }
        
        
        

    

    }
}
