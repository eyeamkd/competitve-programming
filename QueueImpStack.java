//problem to implement queue using stacks 
import java.util.*;
import java.io.*; 
class QueueImpStack {  
	public static void main(String[] args) {
		 Stack<Integer> stack1 = new Stack<Integer>(); 
 		 Stack<Integer> stack2 = new Stack<Integer>();  
 		 Scanner ob = new Scanner(System.in);  
 		 int flag=0; 
 		 while(flag==0){  
 		 	System.out.println("1. Enter the element into the Queue \n2.Delete the element from the queue \n3. display the head queue \n4. Exit \n"); 
 		 	int choice = ob.nextInt(); 
 		 	if(choice==1){   
 		 		while(!stack1.empty()){  
 		 			int ele= stack1.pop(); 
 		 			stack2.push(ele);
 		 		}
 		 		System.out.println("Enter the element"); 
 		 		int element=ob.nextInt();  
 		 		stack1.add(element); 
 		 		while(!stack2.empty()){  
 		 			int ele=stack2.pop();
 		 			stack1.push(ele);
 		 		}
 		 	} 
 		  	if(choice==2){  
 		  		try{  
 		  			int del_ele=stack1.pop(); 
 		 		System.out.println("Deleted Element :"+del_ele);
 		  		}   
 		  		catch(EmptyStackException e){  
 		  			System.out.println("Queue is Empty!");
 		  		}
 		 		
 		 	} 
 		 	if(choice==3){  
 		 		System.out.println("Element at the top of the stack is "+stack1.peek());
 		 	}  
 		 	if(choice==4){  
 		 		System.out.println("Bubye!"); 
 		 		flag=1;
 		 	}

 		 }
	}
}