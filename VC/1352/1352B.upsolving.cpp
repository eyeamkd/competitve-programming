#include <iostream> 
#include <math.h>
using namespace std;

int main() {
	int testCases;  
	cin>>testCases;  
	while(testCases--){  
	    int n,k;  
	    cin>>n>>k;    
	    //checking odd parity
	    if( (((n-k+1)%2) != 0) && (((n-k+1)) >0) ){ 
	        cout<<"YES"<<endl; 
	        for(int i=1;i<=(k-1);i++) 
	            cout<<"1"<<"\t";  
	       cout<<(n-k+1)<<endl; 
	    }else if( (((n+2)-(2*k))%2  == 0) && ( ((n+2)-(2*k)) > 0) ){ 
	        cout<<"YES"<<endl; 
	            for(int i=1;i<=(k-1);i++) 
	                cout<<"2"<<" "; 
	           cout<<n-(2*k)+2<<endl;
	    }else { 
	        cout<<"NO"<<endl; 
	    }
	     
	}
	return 0;
}
