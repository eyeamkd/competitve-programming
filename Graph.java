import java.util.*;
import java.io.*;
class Graph{  
	LinkedList<Integer> adj[]=new LinkedList();
	Graph(int v){  
		adj[]=new LinkedList[v]; 

		for(int i=0;i<v;i++){   
			adj[i]=new LinkedList<>();
		}
	}
}