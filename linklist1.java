import java.util.*;
class Linklist1  { 
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in); 
		int test = ob.nextInt();
		while(test>0){  
			LinkedList<Integer> ll = new LinkedList<Integer>(); 
			int n=ob.nextInt();    
			int posi=0;
			if(n%2==0){
			 posi=n/2; 
			} 
			else {
			 posi = (n+1)/2;  
		}
			while(n>0){  
				int ele=ob.nextInt();
				ll.add(ele);
				n--; 
			}  
			int ele_add = ob.nextInt();
			ll.add(posi,ele_add);  
			System.out.println(ll); 
			test--;
		}
	}
	
}