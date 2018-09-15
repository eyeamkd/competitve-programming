import java.util.*; 
import java.io.*; 
class Linkedlistgfg { 
	public static void main(String[] args) {  
		Scanner ob=new Scanner(System.in);
		LinkedList<Integer> original_list=new LinkedList<Integer>(); 
		LinkedList<Integer> even_list = new LinkedList<Integer>(); 
		LinkedList<Integer> odd_list = new LinkedList<Integer>();
		int test = ob.nextInt();  
		
		int flag=0; 
		while(flag==0) {  
			System.out.println("1. Enter Element \n 2.Exit "); 
			int choice=ob.nextInt(); 
			if(choice==1){  
			System.out.println("Enter the elements of  Linked List"); 
			int element=ob.nextInt(); 
			original_list.add(element);  
			} 
			else if(choice ==2){  
				flag=1;  

			}
		} 
		//segregate the original list into odd and even list. 
		int llsize= original_list.size(); 
		for(int i=0;i<llsize;i++){  
			int element=original_list.get(i); 
			if(element%2==0){  
				even_list.add(element);
			} 
			else {  
				odd_list.add(element);
			}
		} 
		even_list.addAll(odd_list); 
		System.out.println("*** Final Linked List is ****"); 
		System.out.println(even_list); 
	}
	
}