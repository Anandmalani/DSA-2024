import java.util.*;
class Edge{
    int s;
    int d;
    Edge(int s, int d){
        this.s=s;
        this.d=d;
    }
}
public class Graph {
    public static void buildGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));

        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,2));

        graph[4].add(new Edge(4,3));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));



    }
    public static void bfs(ArrayList<Edge> graph[], Queue<Integer> q, boolean vis[], int i){
        q.add(i);
        while(!q.isEmpty()){
            int a=q.remove();
            if(vis[a]==false){
                vis[a]=true;
                System.out.println(a+" ");
                for(int j=0;j<graph[a].size();j++){
                    Edge e=graph[a].get(j);
                
                        q.add(e.d);

                

                }
            }

        }



    }
    public static void dfs(ArrayList<Edge> graph[],boolean vis[], int i){
        System.out.println(i);
        vis[i]=true;
        for(int j=0;j<graph[i].size();j++){
            Edge e=graph[i].get(j);
            if(vis[e.d]==false){
                dfs(graph,vis,e.d);

            }
        }

    }
    public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int src, int des, int curr, String s){
        if(curr==des){
            System.out.println(s);
            // vis[curr]=false;
            return;

        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.d]==false){
                vis[e.d]=true;
                printAllPath(graph, vis, src, des, e.d, s+e.d);
                vis[e.d]=false;

            }
        }


    }
    public static void main(String args[]){
        ArrayList<Edge> graph[]=new ArrayList[7];
        buildGraph(graph);
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];

        // for(int i=0;i<graph.length;i++){
        //     if(vis[i]==false){
                
        //         bfs(graph, q,vis, i);
        //     }

        // }
        // for(int i=0;i<graph.length;i++){
        //     if(vis[i]==false){
                
        //         dfs(graph,vis, i);
        //     }

        // }
        vis[0]=true;
        printAllPath(graph,vis,0,5,0, "0");

    }

    
}
