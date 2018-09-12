import java.util.*;
class Traversal  { 
	static Node head;
	static class Node{  
		int data;
		Node next; 
	
	public   void insert(int d){   
		data=d;
	} 
	}  

	public static void main(String[] args) {  
		Scanner ob = new Scanner(System.in);
		Traversal ll = new Traversal();
		//initializing the linked list 
		System.out.println("*** Linked List Menu ***"); 
		 int lastnumber=0;
		int flag=1; 
		while(flag==1){ 
			System.out.println("1.Enter element in the linked list \n 2. Insert at a particular position \n 3. Insert an element at the beginnning \n 4. Delete an element \n0 to Exit"); 
		int choice= ob.nextInt();  
		//insert element at the end 	
		if(choice==1){  

			System.out.println("Enter the number to be added"); 
			int data=ob.nextInt();
			Node new_node = new Node();  
			new_node.insert(data);  
			if(ll.head==null){  
				ll.head=new_node;
			} 
			else{  
				Node temp = ll.head;
				while(temp.next!=null){   
					temp=temp.next; 
				} 
				temp.next=new_node;
			}
		}//insert at a particular position 
		if(choice==2){  
			System.out.println("Enter the position at which you want to insert the element "); 
			int pos=ob.nextInt();  
			Node temp=ll.head;  
			System.out.println("Enter the data which you want to insert"); 
			int data=ob.nextInt(); 
			Node node=new Node();
			node.insert(data);
			for(int i=1;i<pos-1;i++){    
					temp=temp.next; 
			} 
			node.next=temp.next; 
			temp.next=node;

		}

		if(choice==0){  
			flag=0; 

		}   
	//insert at the beginning. 
	else if(choice == 3){  
		System.out.println("Enter the element you want to insert at the beginning"); 
		int d=ob.nextInt();  
		Node temp;
		temp=ll.head;
		Node node= new Node(); 
		node.insert(d); 
		node.next=temp;  
		ll.head=node; 
		System.out.println("Head element data is "+ll.head.data);
	} 
	//Delete a node  
	if(choice==4){  
		System.out.println("Enter the data of the node which you want to delete "); 
		int del_ele=ob.nextInt(); 
		Node temp=ll.head; 
		while(temp.next.data!=del_ele){  
			temp=temp.next; 
		} 
		temp.next=temp.next.next;
	}
	
		//traversal 
		System.out.println("***Your linked list is ***"); 
		Node ptr = ll.head;
		while(ptr!=null){
			 System.out.println(""+ptr.data); 
			 ptr=ptr.next;
		} 

	
	
	} 
}

}