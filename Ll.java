import java.util.*; 
import java.io.*;
class Ll  { 
	public static void main(String[] args) {  
		Scanner ob=new Scanner(System.in);
		LinkedList<String> mylist =new LinkedList<String>();   
		int flag=1;
		while(flag==1){
		System.out.println("**Linked List in JAVA**\n1.Add name to the list \n 2.Display List \n3.Add name at a particular position\n4.Delete Element\n5.Add element to the beginning of the list\n6.Enter element to be added at the end of the list\nPress 0 to Exit\n");  
		int choice = ob.nextInt(); 
		if(choice==1){  
			System.out.println("Enter the element you would like to add\n"); 
			String element= ob.next(); 
			mylist.add(element); 

		}  
		else if(choice==2){   
			System.out.println("Your linked list now looks like\n"); 
			System.out.println(mylist);

		} 
		else if (choice==3) { 
			System.out.println("Enter the position");
			int pos=ob.nextInt(); 
			System.out.println("Enter the name to add"); 
			String name=ob.next();
			mylist.add(pos,name);  
			System.out.println("Element added");
			
		}else if(choice ==4){  
			System.out.println("Enter the element to be deleted"); 
			String del_element=ob.next();
			mylist.remove(del_element); 
			System.out.println("Element Deleted");
		}  
		else if(choice==5){  
			System.out.println("Enter the element to be added "); 
			String first_ele=ob.next(); 
			mylist.addFirst(first_ele); 
			System.out.println("Element added");
		} 
		else if(choice==6){  
			System.out.println("Enter the element to be added at last"); 
			String last_ele=ob.next(); 
			mylist.addLast(last_ele); 
			System.out.println("Element added");
		}
		else if(choice==0){  
			flag=0; 
			System.out.println("Thank you!");
		}


		
	}
	
} 
}