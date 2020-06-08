#include <iostream> 
#include<math.h>
using namespace std;

int main() {
	int testCases; 
	cin>>testCases; 
	while(testCases--){ 
	    int n; 
	    cin>>n; 
	    for(int k=2;k<=1000000000;k++){  
	        int div = (pow(2,k)-1);
	        if((n % div) == 0){ 
	            cout<<(n/div)<<endl; 
	            break;
	        }
	    }
	}
	return 0;
}
