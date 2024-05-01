import java.util.*;
class Edge{
    int src;
    int des;
    public Edge(int src, int des){
        this.src=src;
        this.des=des;

    }
}
public class GaphImp{
    public static void craeteGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,2));




    }
    public static void dfs(boolean vis[],ArrayList<Edge> graph[] , int curr){
        // Queue<Integer> q=new LinkedList<Integer>();
        System.out.println(curr);
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            if(vis[graph[curr].get(i).des]==false){
                dfs(vis,graph,graph[curr].get(i).des);

            }
            
        }



    }
    public static void bfs( ArrayList<Edge> graph[],Queue<Integer> q1,int v,boolean vis[] ){

        q1.add(0);
        while(!q1.isEmpty()){
            int a=q1.remove();
            if(vis[a]==false){
                System.out.println(a);
                vis[a]=true;
                for(int i=0;i<graph[a].size();i++){
                    q1.add(graph[a].get(i).des);
                }

            }

        }

      

    }
    public static void allPathDfs(boolean vis[],ArrayList<Edge> graph[] , int src, int tar, int curr, String s){
        if(curr==tar){
            System.out.println(s);
            // System.out.println();
            return ;

        }
        // System.out.print(curr+" ");
      
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.des]==false){
                vis[curr]=true;
                allPathDfs(vis,graph,src,tar,e.des,s+e.des);
                vis[curr]=false;

            }
            
        }
       



    }
     public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[4];
        craeteGraph(graph);
        for(int i=0;i<graph[0].size();i++){
            System.out.println(graph[0].get(i).des);
        }
        int v=4;
        boolean vis[]=new boolean[v];
        Queue<Integer> q1=new LinkedList<Integer>();
        bfs(graph,q1,v,vis);
        boolean vis1[]=new boolean[v];
        Queue<Integer> q=new LinkedList<Integer>();
        // for(int i=0;i<v;i++){
        //     if(vis1[i]==false){
        //         dfs(vis1,graph, i);
        //     }

        // }
        allPathDfs(vis1, graph, 0, 3, 0, "0");
        
        
    }
}

