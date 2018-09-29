//Representation of Graph using Adjacency List 
import java.util.*;
import java.io.*;

class GraphRep {  
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in); 
		System.out.println("*** Graph Representaion in Java ***");  
		System.out.println("Enter the number of vertices in the graph");
		int v=ob.nextInt();  
		//array of linked list 
		@SuppressWarnings("unchecked")LinkedList<Integer>[] adjlist = new LinkedList[5];

		for(int i=0;i<v;i++){  
			adjlist[i]=new LinkedList<Integer>();
		} 

		int flag=0; 
		while(flag==0){  
			System.out.println("1. Add Edge \n 2. Terminate"); 
			int choice = ob.nextInt();
			if(choice ==1){  
				System.out.println("Enter the Source edge "); 
				int src = ob.nextInt();
				System.out.println("Enter the destination edge "); 
				int dest = ob.nextInt(); 
				adjlist[src-1].addFirst(dest-1); 
				adjlist[dest-1].addFirst(src-1); 
			} 
			if(choice==2){  
				flag=1;
			}
		} 
		System.out.println("Your Graph looks like"); 
		for(int i=0;i<v;i++){   
			int maxsize=adjlist[i].size(); 
			System.out.println("Size of first Vertex is "+maxsize);
			for(int j=0;j<maxsize;j++){  
				System.out.print(adjlist[i].get(j)+"->");
			}  
			System.out.println("");
		} 

} 
}