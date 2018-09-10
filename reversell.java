import java.util.*;
import java.io.*;
class reversell { 
	public static void main(String[] args) {  
		Scanner ob =new Scanner(System.in);
		LinkedList<Integer> mylist=new LinkedList<Integer>();    
		System.out.println("Enter the size of the linked list"); 
		int size=ob.nextInt();
		while(size>0){  
			System.out.println("Enter the element"); 
			int ele=ob.nextInt();
			mylist.add(ele); 
			size--;
		}  
		int n=mylist.size(); 
		for(int i=0;i<n;i++) { 
			//System.out.println("in the for loop");
			System.out.println(""+mylist.get(n-i-1));
		}
		
	}
	
}