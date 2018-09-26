import java.util.*; 
import java.io.*;
class StackImp{  
	public static void main(String[] args) {  
		Scanner ob = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>(); 
		int flag=0;
		while(flag==0){  
			System.out.println("1.Add Element into the stack \n 2.Delete Element from Stack \n 3.Display top element of the Stack \n 4.Check if the stack is empty \n5. Search for an element in the stack \n 0. Exit "); 
			int choice = ob.nextInt(); 
			if(choice==1){  
				System.out.println("Enter the element "); 
				int ele = ob.nextInt(); 
				stack.push(ele);
			} 
			if(choice==2){  
				try{  
					System.out.println(stack.pop()+":Element Removed");
				}  
				catch(EmptyStackException e){  
					System.out.println("Stack empty no element to delete");
				}
				
			} 
			if(choice==3){  
				System.out.println("Top Element of the stack is :"+stack.peek());
			} 
			if(choice==4){ 
				boolean resp = stack.empty(); 
				if(resp==true){  
					System.out.println("Yes , The stack is Empty!");
				} 
				else{  
					System.out.println("No, the stack is not Empty ");
				}
			} 
			if (choice==5){ 
				System.out.println("Enter the element to search ");
				int ele= ob.nextInt(); 
				int pos=stack.search(ele); 
				if(pos==-1){ 
					System.out.println(" :( ELEMENT NOT FOUND");	
				} 
				else {  
					System.out.println("Element found at "+pos);
				}
			} 
			if(choice==0){  
				System.out.println("Bubye!!");
				flag=1;
			}
		}
		
	}
}