package algo3_2;


public class main {
public static void targil2(Graph G){
	for(int i=0;i<G.edges.size();i++){
		G.visit[G.edges.get(i).src]=true;
		if(G.visit[G.edges.get(i).dest]==true){
			G.visit[G.edges.get(i).src]=false;
			G.edges.remove(G.edges.get(i));
			i=i-1;
		}
	}
}
	public static void main(String[] args) {
		Graph G=new Graph(7,7);
		G.addEdge(0, 1,15);
		G.addEdge(0, 2,5);
		G.addEdge(2, 3,5);
		G.addEdge(5, 6, 15);
		G.addEdge(3, 1,6);
		G.addEdge(3, 4,8);
		G.addEdge(1, 4,10);
		for(int i=0;i<G.edges.size();i++){
			System.out.print(G.edges.get(i).src+"->"+G.edges.get(i).dest+" ");
		}
		targil2(G);
		System.out.println();
		for(int i=0;i<G.edges.size();i++){
			System.out.print(G.edges.get(i).src+"->"+G.edges.get(i).dest+" ");
		}

	}

}
