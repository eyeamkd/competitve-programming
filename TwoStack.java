import java.util.*;
import java.io.*; 
class TwoStack {  
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in); 
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		int flag=0; 
		while(flag==0){  
			System.out.println("1.ADD ELEMENT IN STACK 1\n2.ADD ELEMENT IN STACK 2\n3.STACK 1 - POP\n4.STACK 2 - POP\n5.STACK 1 PRINT\n6.STACK 2 PRINT\n7.EXIT\n"); 
			int choice =ob.nextInt();  
			int stack_1_index=0;
			int stack_2_index=1;
			if(choice==1){   
				System.out.println("Enter Element to add in stack 1"); 
				int ele = ob.nextInt();
				al.add(stack_1_index,ele); 
				stack_1_index=stack_1_index+2; 
			}	 
			if(choice==2){   
				System.out.println("Enter Element to add in stack 2"); 
				int ele = ob.nextInt();
				al.add(stack_2_index,ele); 
				stack_2_index=stack_2_index+2; 
			}	 
			if(choice==3){  
				System.out.println("Top Element of the stack 1 is"+al.get(stack_2_index)); 
				stack_2_index=stack_2_index-2; 
			}	 
			if(choice==4){  
				System.out.println("Top Element of the stack 1 is"+al.get(stack_1_index)); 
				stack_1_index=stack_1_index-2; 
			} 
			if(choice==5){  
				System.out.println("*** ELEMENTS OF STACK 1 ***"); 
				for (int i =0 ;i<=al.size();i=i++){ 
				System.out.println(al.get(i));  
				i++;
				}
			} 
			if(choice==6){  
				System.out.println("*** ELEMENTS OF STACK 2 ***"); 
				for (int i =1 ;i<=stack_2_index;i=i++){ 
				System.out.println(al.get(i));  
				i++;
				}
			} 
			if(choice==7){  
				System.out.println("Bubye"); 
				flag=1;
			}	 
		} 

	}
 
}