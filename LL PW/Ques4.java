
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Ques4{
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
    public boolean checkPalindrome(Node head){
        Node a=head;
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        Node b=s.next;
        Node c=reverse(b);

        // s.next=null;
        while(c!=null){
            if(a.data==c.data){
                a=a.next;
                c=c.next;
            }
            else{
                return false;
            }
        }
        return true;

    }
    


    public static void main(String args[]){
        Ques4 linkedList=new Ques4();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(2);
        linkedList.addLast(1);
        System.out.print(linkedList.checkPalindrome(linkedList.head));
        // Node a=linkedList.head;
        // while(a!=null){
        //     System.out.print(a.data+" ");
        //     a=a.next;

        // }
        
        
        

    

    }
}
