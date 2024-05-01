import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}class BinaryTree{
    static int i=-1;
    public static Node buidTree(int Nodes[]){
        i++;
        if(Nodes[i]==-1){
            return null;
        }
        Node node=new Node(Nodes[i]);
        node.left=buidTree(Nodes);
        node.right=buidTree(Nodes);
        return node;
    

    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
}
public class TreeImp{

    public static void main(String args[]){
        // int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree t1=new BinaryTree();
        // Node root=t1.buidTree(Nodes);
        // System.out.println(root.data);
        // t1.inOrder(root);
        char c='a';
        int d=c;
        double e=c;
        char f=(char) e;
        int arr[]={1,2,3};
        int arr1[]=arr;
        String a=new String("sn");
        String b="sn";
        System.out.println(a.compareTo(b));
        System.out.println(arr+" "+arr1 );
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(67);




    }

}