class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Ques5{
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
    public Node reverse(Node head){
        Node curr=head;
        Node pre=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;

    }
    public Node sum(Node a, Node b){
        a=reverse(a);
        b=reverse(b);
        Node c=new Node(0);
        Node e=c;
        int carry=0;
        int d;
        while(a!=null && b!=null){
            d=a.data+b.data+carry;
            if(d<10){
                c.next=new Node(d);    
                // c=c.next;          
            }
            else{
                carry=carry+d/10;
                c.next=new Node(d%10);

            }
            a=a.next;
            b=b.next;
            c=c.next;




        }
        if(carry==1){
            c.next=new Node(1);
        }
        return reverse(e.next);


    }
    


    public static void main(String args[]){
        Ques5 linkedList1=new Ques5();
        Ques5 linkedList2=new Ques5();
        linkedList1.addLast(5);
        linkedList1.addLast(6);
        linkedList1.addLast(3);

        linkedList2.addLast(8);
        linkedList2.addLast(4);
        linkedList2.addLast(2);
        Node c=linkedList1.sum(linkedList1.head,linkedList2.head);
        while(c!=null){
            System.out.print(c.data+" ");
            c=c.next;
        }
        

    

    }
}