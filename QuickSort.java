import java.util.Scanner;
class QuickSort {  

	public static void QuickSorting(int arr[],int p,int r){    
		
		
		if(p<r){  
			int q= partition(arr,p,r); 
			QuickSorting(arr,p,q-1);
			QuickSorting(arr,q+1,r);
		}

	} 
	public static int partition(int arr[],int p,int r){  
		int i=p-1;
		int j;
		int x=arr[r];  
		int temp=0;
		for(j=0;j<(r-1);j++){   
			if(arr[j]<x){  
				i++;  
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp; 
			} 
		} 
		temp=x;
		x=arr[i+1];
		arr[i+1]=temp; 
		return i+1;
	}  
	public static void main(String args[]){   
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Size of the array");  
		int n =ob.nextInt();  
		int[] arr=new int [n];  
		int i; 
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++){  
			arr[i]=ob.nextInt(); 
		} 
		System.out.println("** UNSORTED ARRAY **"); 
		for(i=0;i<n;i++){  
			System.out.println("\t"+arr[i]);
		} 
		System.out.println("\n");
		QuickSorting(arr,0,n);  
		System.out.println("** SORTED ARRAY **"); 
		for(i=0;i<n;i++){  
			System.out.println("%d\t"+arr[i]);
		}


		 
	}
}