import java.util.*;
class Edge{
    int src;
    int des;
    Edge(int src, int des){
        this.src=src;
        this.des=des;
    }
}

public class Graph1 {
    public static void buildGraph( ArrayList<Edge> graph[]){


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
    public static void bfs( ArrayList<Edge> graph[],boolean vis[], int i,Queue<Integer> q){
        q.add(i);
        vis[i]=true;
        System.out.print(i+" ");
        while(!q.isEmpty()){
            int a=q.remove();
            // vis[a]=true;
            
            for(int j=0;j<graph[a].size();j++){
                Edge e=graph[a].get(j);
                if(vis[e.des]==false){
                    q.add(e.des);
                    vis[e.des]=true;
                    System.out.print(e.des+" ");
                }

            }

        }
        // System.out.print(i+" ");

    }
    public static void printAllPathdfs( ArrayList<Edge> graph[],boolean vis[], int s,int d, int curr, String str){
        if(curr==d){
            System.out.println(str);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.des]==false){
                vis[e.des]=true;
                printAllPathdfs(graph,vis,s,d,e.des,str+e.des);
                vis[e.des]=false;

            }
        }

    }
    
    public static void dfs( ArrayList<Edge> graph[],boolean vis[], int i){
        System.out.print(i+" ");
        vis[i]=true;
        for(int j=0;j<graph[i].size();j++){
           Edge e= graph[i].get(j);
           if(vis[e.des]==false){
            dfs(graph,vis,e.des);
           }
        }

    }
    public static boolean cycleExistInUndirected(ArrayList<Edge> graph[],boolean vis[], int ch, int pa){
        vis[ch]=true;
        
        for(int i=0;i<graph[ch].size();i++){
            Edge e=graph[ch].get(i);
            if(vis[e.des]==false){
                return cycleExistInUndirected(graph,vis,e.des,ch);
                

            }
            else{
                if(e.des!=pa){
                    return true;
                }
            }

        }
        return false;
        
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
        graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        // graph[3].add(new Edge(3, 0));
    }
    public static boolean cycleExistInDirected(ArrayList<Edge> graph[],boolean vis[], boolean arr[], int i ){
        vis[i]=true;
        arr[i]=true;
        for(int j=0;j<graph[i].size();j++){
            Edge e=graph[i].get(j);
            if(vis[e.des]==false){
                if(cycleExistInDirected(graph,vis,arr,e.des)){
                    return true;
                }
                // arr[e.des]=false;


            }
            else{
                if(arr[e.des]){
                    return true;
                }
            }
        }
        arr[i]=false;
        return false;
    }
        
    public static void main(String args[]){
         ArrayList<Edge> graph[]=new ArrayList[7];
         ArrayList<Edge> graph1[]=new ArrayList[7];
        buildGraph(graph);
        // boolean vis[]=new boolean[7];
        Queue<Integer> q=new LinkedList<>();
        // for(int i=0;i<7;i++){
        //     if(vis[i]==false){
        //         // dfs(graph,vis,i);
        //         bfs(graph, vis,i, q);

        //     }
        // }
        // vis[0]=true;
        // printAllPathdfs(graph,vis,0,5,0,"0");
       
        // System.out.println(cycleExistInUndirected(graph,vis,0,-1));
        createGraph(graph1);
        boolean vis[]=new boolean[4];
        boolean arr[]=new boolean[4];
        int flag=0;
        for(int i=0;i<4;i++){
            if(vis[i]==false){
                if(cycleExistInDirected(graph1,vis,arr,i)){
                    flag=1;
                    System.out.println(true);
                    break;
                    
                };

            }
        }
        if(flag==0){
            System.out.println(false);
            
        }
        



    }
    
}
