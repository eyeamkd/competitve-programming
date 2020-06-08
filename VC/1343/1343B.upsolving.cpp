#include <iostream> 
#include <math.h>
using namespace std;

int main() {
	int testCases; 
	cin>>testCases; 
	while(testCases--){ 
	    int n; 
	    cin>>n; 
	    if(n%4!=0){ 
	        cout<<"NO"<<endl; 
	    } 
	    else{  
	    cout<<"YES"<<endl; 
	    int size = n/2;
	    int oddPart[size]; 
	    int evenPart[size];  
	    int value=1; 
	    for(int i=0;i<size;i++){ 
	        oddPart[i]=value; 
	        value+=2; 
	    } 
	    value=2; 
        for(int i=0;i<size;i++){ 
	        evenPart[i]=value; 
	        value+=2; 
	    }  
	    
	    oddPart[size-1] = oddPart[size-1]+(n/2);
	    
	   
	    //print even 
	    for(int i=0;i<size;i++){ 
	        cout<<evenPart[i]<<" ";
	    } 
	     for(int i=0;i<size;i++){ 
	        cout<<oddPart[i]<<" ";
	    } 
	    cout<<endl;
	   }
	    //n is even  
	   
	    
	}
	return 0;
}
