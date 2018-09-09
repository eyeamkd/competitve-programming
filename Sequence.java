import java.util.*;
import java.io.*; 
import java.lang.*;
class Sequence {  
	public static void main(String[] args) {  
		Scanner ob =new Scanner(System.in); 		 
		System.out.println("Enter the number of sequences to be created \n"); 
		int size=ob.nextInt(); 
		ArrayList<ArrayList<Integer>>  seqlist = new ArrayList<ArrayList<Integer>>(size);  
		ArrayList<Integer> sequences=new ArrayList<Integer>();  
		System.out.println("Enter the number of queries"); 
		int  queries_no =ob.nextInt();   
		int lastAnswer=0;
		String[] query =new String[queries_no];  
		System.out.println("Enter the queries");
		for (String i:query ) { 
			i=ob.next(); 
			if(i.charAt(0)=='1'){  
				
				int number=Integer.parseInt(i.substring(1,1));  
				int index = (number^lastAnswer)%size;  
				int value=Integer.parseInt(i.substring(2,2));
				sequences.add(index,value); 
				seqlist.add(sequences);
			} else if(i.charAt(0)=='2'){    
				int number=Integer.parseInt(i.substring(1,1));  
				int index = (number^lastAnswer)%size;   
				ArrayList<Integer> al= seqlist.get(index);
				int s=al.size();
				lastAnswer=(Integer.parseInt(i.substring(2,2)))%((s)); 
				System.out.println(lastAnswer);

			}
		} 


	}
}