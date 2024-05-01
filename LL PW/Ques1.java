class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Ques1{
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
    public boolean keyExist(int x, Node head){
        if(head==null){
            return false;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==x){
                return true;
            }

            temp=temp.next;
        }
        return false;


    }


    public static void main(String args[]){
        Ques1 linkedList=new Ques1();
        linkedList.addLast(14);
        linkedList.addLast(21);
        linkedList.addLast(11);
        linkedList.addLast(30);
        linkedList.addLast(10);
        int x=14;
        System.out.println(linkedList.keyExist(x,linkedList.head));

    

    }
}