import java.util.*;
import java.io.*;

class Reversell {   
	Node head;
	class Node{  
		int data;  
		Node next; 
		void insert(int d){  
			data=d; 
			next=null; 
		}
	}
	public static void main(String[] args) {
		 //reversing process    
		Node curr = new Node(); 
		Node next = new Node(); 
		Node prev = new Node();  
		curr=head;  
		prev=null;
		while(curr!=null){   
			next=curr.next;  
			curr.next=prev; 
			prev=curr;  
		 curr=next;


		}

	}
}