import java.util.*;
class Edge{
    int src;
    int des;
    int weight;
    Edge(int src, int des, int weight){
        this.src=src;
        this.des=des;
        this.weight=weight;
    }
}
class Node implements Comparable<Node>{
    int index;
    int disvalue;
    Node(int index, int disvalue){
        this.index=index;
        this.disvalue=disvalue;
    }
    @Override
    public int compareTo(Node value){
        return this.disvalue-value.disvalue;
    }
}
public class DijkstraAlgo {
    public static void shortestPath(ArrayList<Edge> graph[],PriorityQueue<Node> q,boolean vis[],int[] ans){
        while(!q.isEmpty()){
            Node a=q.remove();
            // ans[a.index]=a.disvalue;
            for(int i=0;i<graph[a.index].size();i++){
                Edge e=graph[a.index].get(i);
                if(vis[e.des]==false){
                    q.add(new Node(e.des,e.weight));
                    if(ans[a.index]+e.weight<ans[e.des]){
                        ans[e.des]=ans[a.index]+e.weight;
                    }
                }

            }
            vis[a.index]=true;


        }


    }
    public static void buildGraph( ArrayList<Edge> graph[]){
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }
    public static void main(String args[]){
        ArrayList<Edge> graph[]=new ArrayList[6];
        for(int i=0;i<6;i++){
            graph[i]=new ArrayList<>();

        }
        buildGraph(graph);
        PriorityQueue<Node> dis=new PriorityQueue<>();
        boolean vis[]=new boolean[6];
        dis.add(new Node(0,0));
        int[] ans=new int[6];
        ans[0]=0;
        for(int i=1;i<6;i++){
            ans[i]=Integer.MAX_VALUE;
        }
        shortestPath(graph,dis,vis,ans);
        System.out.println(Arrays.toString(ans));
        // for(int i=0;)



    }
    
}
