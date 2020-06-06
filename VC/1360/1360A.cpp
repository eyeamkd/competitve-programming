#include <iostream> 
#include <math.h> 
#include<algorithm>
using namespace std;
 
int main() { 
    int t; 
    cin>>t; 
    while(t--){  
        int a,b;
	    cin>>a>>b;   
	   // long long int x1 = ceil(sqrt(2*a*b)); 
	   // long long int x2 = max(2*a,b); 
	   // long long int x3 = max(2*b,a); 
	   int x = min( max(2*a,b), max(2*b,a) ); 
	   cout<<x*x<<endl;
	    
    }
	return 0;
}