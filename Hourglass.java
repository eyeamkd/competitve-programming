import java.util.*;
import java.io.*;
class Hourglass{  

	public static void main(String[] args) {  
		int[][] arr={   
			{-1, -1, 0 ,-9, -2, -2},
			{-2 ,-1, -6 ,-8 ,-2 ,-5},
			{-1 ,-1 ,-1 ,-2 ,-3 ,-4},
			{-1 ,-9 ,-2, -4 ,-4 ,-5},
			{-7 ,-3 ,-3 ,-2 ,-9 ,-9},
			{-1 ,-3 ,-1 ,-2, -4, -5},

		};
		 int hg[]=new int[20]; 
        int sum=0; 
        int count=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){  
                for(int k=0;k<3;k++){   
                    sum=sum+arr[i][j+k]+arr[i+2][j+k];
                }  
                sum=sum+arr[i+1][j+1];  
                hg[count]=sum; 
                sum=0;
                count++;
            }
        } 
        int maxsum=hg[0];
        for(int l=0;l<16;l++){   
               System.out.println("the sum of Hourglass"+l+"is "+hg[l]);

            if(hg[l]>=maxsum) 
                maxsum=hg[l];
        } 
        
        System.out.println("the sum is"+maxsum);

} 
}