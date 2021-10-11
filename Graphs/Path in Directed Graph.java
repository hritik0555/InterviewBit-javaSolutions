public class Solution {
   
    public class Edge
    {
        int src;
        int nbr;
        Edge(int src,int nbr)
        {
            this.src=src;
            this.nbr=nbr;
 
        }
    }
 
     public int solve(int A, int[][] B) {
 
         ArrayList<Edge> graph[]=new ArrayList[A+1];
 
         for(int i=0;i<A+1;i++)
         {
             graph[i]=new ArrayList<Edge>();
         }
 
         for(int row[] : B)
         {
             int v1=row[0];
             int v2=row[1];
 
             graph[v1].add(new Edge(v1,v2));
         }
 
 
         HashSet<Integer> hs=new HashSet<Integer>();
         return isPath(graph,1,A,hs);
 
     }
 
     public static int isPath(ArrayList<Edge> graph[],int src,int des,HashSet<Integer> hs)
     {
         if(src==des)
         {
             return 1;
         }
 
       hs.add(src);
 
       for(Edge e: graph[src])
       {
           if(hs.contains(e.nbr)==false)
           {
              if(isPath(graph,e.nbr,des,hs)==1)
              {
                  return 1;
              }
           }
       }
     
         return 0;
     }
 }
 