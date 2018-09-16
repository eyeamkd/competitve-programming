import java.io.*;
import java.util.*;
class Reverse_sll {   
	class Node{  
		Node head; 
		insert(int d){   
			int data=d; 
			Node next; 
		}
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);   
		
		int flag=1;  
		while(flag==1){
		System.out.println("***Menu***\n 1.Insert Element \n 2.Reverse the linked list \n 0.Exit\n"); 
		int choice=ob.nextInt();  
		if(choice==1){   
			System.out.println("Enter the element to be added "); 
			int ele=ob.nextInt(); 
			Node new_node=new Node; 
			new_node.insert(d);
		}   
		else if(choice==2){   
			Node current_node= new Node();  
			current_node=head; 
			while(current_node.next!=null){  
			 Node prev_node=new Node(); 
			 prev_node=current_node.next; 
			 prev_node.next=current_node; 
			 current_node=current_node.next; 
			}

		}

	}

	}
}