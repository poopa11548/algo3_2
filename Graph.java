package algo3_2;
import java.util.LinkedList;
public class Graph {
	class edge{
		int src;
		int dest;
		int whight;
		edge(int s,int d,int w){
			src=s;
			dest=d;
			whight=w;
		}
	};
	    int v; 
	    int e;
	    int[] d;
	    int [] p;
	    boolean [] visit;
	    String color[];
	    LinkedList<edge> edges;
	    Graph(int v_,int e_)
	    {
	    	visit=new boolean [v_];
	    	for(int i=0;i<visit.length;i++)
	    		visit[i]=false;
	    	e=e_;
	        v= v_;
	        d=new int[v];
	        p=new int [v];
	        color=new String[v];
	        edges=new LinkedList<edge>();
	    }
	    void addEdge(int v, int u,int w)
	    {
	    	edge T=new edge(v,u,w);
	        edges.add(T);
	        T=new edge(u,v,w);
	        edges.add(T);
	    }
}
