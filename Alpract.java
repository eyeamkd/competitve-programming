import java.io.*;
import java.util.*; 
class Alpract{   
	public static void main(String[] args) {   
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size of the array\n"); 
		int n=ob.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);  
		for(int i=0;i<n;i++){  
			arr.add(i);
		} 
		System.out.println(arr); 
		
		int key,flag; 
		flag=0;
		while(flag==0){
		System.out.println("** Choose the operation **\n 1. Find any element in the array \n 2. Delete Array\n3.Add element to the array\n4.Exit\n5.Create a new Array\n");  
		int choice = ob.nextInt();  
		if(choice==1){  
			System.out.println("Enter the key element to find\n"); 
			key=ob.nextInt();
			System.out.println("The element is present at "+arr.indexOf(key)+"position"); 
		}else if(choice ==2){  
			arr.clear();
			System.out.println("Array deleted"+arr); 
			flag=1;
		}else if(choice ==3){  
			System.out.println("Enter the element to be entered\n"); 
			key=ob.nextInt();  
			if(arr.indexOf(key)==-1){  
					arr.add(key);  
					System.out.println("Element added \n"+arr);
			} else{  
				System.out.println("Element already exists , do you still want to add?\n Y --> Yes \n N--> No\n"); 
				char response = ob.next().charAt(0); 
				if(response=='Y'||response=='y'){  
					arr.add(key); 
					System.out.println("Element added \n"+arr);
				}else if(response=='N'||response=='n'){
					continue;
				}else{  
					System.out.println("Invalid response, try again\n");
					continue;
				}

			}
		
			
		}else if(choice==4){ 
			System.out.println("Bubye!");
			flag=1;
		} 
		else if(choice==5){  
			Integer[] na=new Integer[arr.size()]; 
			na=arr.toArray(na); 
			System.out.println("Array Created\n Do you want to view the array? \n Y--> yes \n N--> No");
			char ch=ob.next().charAt(0); 
			int flag2=0;  
			while(flag2==0){
			if(ch=='y'||ch=='Y'){  
				for(Integer i: na){  
					System.out.println(i+"\t"); 
				} 
				flag2=1;
			}  
			else if(ch=='n'||ch=='N') {   
				flag2=1;
				continue; 

			} 
			else {  
				System.out.println("Enter valid option and try again \n"); 

			}

		}  
	}

		
	} 
}
}