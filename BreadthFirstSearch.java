//create graph  
//create queue
//traverse through the neighbours of all the nodes 
//if the node is visited ignore if not put the node in queue 
//once the traversal of all the nodes is done then remove the head and  
//start traversing through the remaining nodes in the queue.  
import java.util.*; 
import java.io.*;
class BreadthFirstSearch  { 
	
	void CreateGraph(){   
		Scanner ob = new Scanner(System.in); 
		System.out.println("Enter the Number of Vertices "); 
		int v = ob.nextInt();  
		//creating a array of linked list 
		@SuppressWarnings("unchecked")LinkedList<Integer>[] adjlist = new LinkedList[v];   
		for(int i=0;i<v;i++){   
			//adding linked list to each element in the array 
			adjlist[i]=new LinkedList<Integer>(); 
		} 
		//graph input. 
		int flag=0; 
		while(flag==0){  
			System.out.println("1.Add Edge \n 2. Terminate \n"); 
			int choice = ob.nextInt(); 
			if(choice ==1){  
				System.out.println("Enter the source vertex"); 
				int src = ob.nextInt(); 
				System.out.println("Enter the destination vertex "); 
				int dest = ob.nextInt(); 
				//as the graph is non-directional  
				adjlist[src-1].addFirst(dest-1);  
				adjlist[dest-1].addFirst(src-1);   
			} 
			if(choice==2){ 
				flag=1; 
			} 
		}//graph input ended 	
		int[] visited= new int[v];  
		Arrays.fill(visited,0,v-1,0); 
		Queue<Integer> q= new LinkedList<Integer>();   
		//traversal of graph created 
		System.out.println("Enter the vertex from which you want to start the traversal"); 
		int src = ob.nextInt(); 
		visited[src]=1; 
		q.add(src); 
		while(q.size()!=0){  
			int node = q.poll();  
			System.out.println("Found : "+node);
			int size = adjlist[node].size(); 
			for(int i=0;i<size;i++){  
				if(visited[adjlist[node].get(i)]==0){  
					visited[adjlist[node].get(i)]=1; 
					q.add(adjlist[node].get(i)); 
				}
			}
		}
	
	} 

	public static void main(String[] args) { 
		BreadthFirstSearch obj = new BreadthFirstSearch();
		obj.CreateGraph();
	}
	
}