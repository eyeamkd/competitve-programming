import java.util.*; 
import java.io.*; 
class Linklist { 
	
	public static void main(String[] args) {   
		LinkedList<Integer> ll = new LinkedList<Integer>();  
		Scanner ob = new Scanner(System.in); 
		int flag=0;
		while(flag==0){ 
			System.out.println("***Linked list Menu***\n1.Add element to the Linked list\n2.Add element at specific postition\n3.Display the Linked List\n4.Delete the list \n0.EXIT ");  
			int choice = ob.nextInt();   
		if(choice==1){  
			System.out.println("Enter the element to add"); 
			int element = ob.nextInt(); 
			ll.add(element);
		}  
		else if(choice==2){  
			System.out.println("Enter the postition to add the element"); 
			int postition=ob.nextInt(); 
			try{   
				System.out.println("Enter the element to be added \n");  
				int element=ob.nextInt();
				ll.add(postition,element); 
			}catch (IndexOutOfBoundsException e) { 
				System.out.println("Enter valid address");
				
			}
		} 
		else if(choice==3) { 
			System.out.println("***Your Linked List is***"); 
			System.out.println(ll);
			
		}else if(choice==4){   
			System.out.println("Are you sure you want to delete the list ?"); 
			String ch=ob.next();  
			String cr= new String("yes");
			System.out.println("Your Response: "+ch);
			if(cr.equals(ch)){  
				ll.clear();
				System.out.println("List Deleted!");
			}else {  
				System.out.println("Operation Terminated");
			}
		}
		else if(choice==0){  
			flag=1;
		} 
	}



	}
	
}