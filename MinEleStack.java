import java.util.*;
import java.io.*; 
class MinEleStack {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in); 
		Stack<Integer> stack = new Stack<Integer>(); 
		Stack<Integer> minStack = new Stack<Integer>(); 
		int flag=0;
		while(flag==0){  
			System.out.println("1.Add Element\n2.Display Min Element\n3.Display Head\n4.Delete Element\n5.Exit");  
			int choice=ob.nextInt();
			if(choice==1){  
				System.out.println("Enter the element you want to add"); 
				int ele= ob.nextInt(); 
				if(stack.empty())
					{   
						minStack.push(ele);  
						stack.push(ele);
					}	
				else{  
					stack.push(ele); 
					if(ele<minStack.peek()){  
						minStack.push(ele);
					}
				}
			} 
			if(choice==4){  
				int ele=stack.peek();
				if(minStack.peek()==ele){  
					minStack.pop();
				} 
				System.out.println("Element deleted :"+stack.pop());
			} 
			if(choice==2){  
				System.out.println("Minimum Element is "+minStack.peek());
			}  
			if(choice==3){  
				System.out.println("Head of the Stack is "+stack.peek());
			} 
			if(choice==5){   
				System.out.println("Bubye!"); 
				flag=1; 
			}
		}
	}
}