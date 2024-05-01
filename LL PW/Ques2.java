
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Ques2{
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
    public void addValueAfter(int p,int v, Node head){
        if(head==null){
            return ;
        }
        Node n1=new Node(v);
        Node temp1;
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==p){
                temp1=temp.next;
                temp.next=n1;
                n1.next=temp1;

                return;
            }

            temp=temp.next;
        }
        


    }


    public static void main(String args[]){
        Ques2 linkedList=new Ques2();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        int pointer=2;
        int value=3;
        linkedList.addValueAfter(pointer, value, linkedList.head);
        Node a=linkedList.head;
        while(a!=null){
            System.out.print(a.data+" ");
            a=a.next;

        }

    

    }
}