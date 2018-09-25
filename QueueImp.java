import java.util.*;
import java.io.*;

class QueueImp {  
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);  
		Queue<Integer> q = new LinkedList<Integer>(); 
		int flag=0;
		while(flag==0){  
			System.out.println("1.Insert Element in the queue \n2.Remove element from the queue\n3.Display Queue\n4.Exit" ); 
			int choice = ob.nextInt(); 
			if(choice==1){  
				System.out.println("Enter Element"); 
				int ele = ob.nextInt(); 
				q.add(ele); 
			} 
			if(choice==2){  
				int ele = q.remove();  
			}  
			if(choice ==3){  
			System.out.println(q); 
			} 
			if(choice==4){  
				flag=1;
			}
	}
} 
}