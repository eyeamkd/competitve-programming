#include <iostream> 
#include <math.h> 
#include <vector>
using namespace std;

int main() { 
    int testCases; 
	std::cin>>testCases; 
	while(testCases--){ 
	    int number;   
	    int totalDigits = round(log10(number)); 
	    int initialPlace = 0; 
	    vector<int> numbersToPrint; 
	    int summands=0;
	    cin>>number; 
	    while(number>0){ 
	        int digit = number%10; 
	        if(digit!=0){ 
	            summands++; 
	            numbersToPrint.push_back(digit*pow(10,initialPlace)); 
	        } 
	        initialPlace++; 
	        number=number/10; 
	    } 
	    
	    cout<<summands<<endl; 
	    for(auto i = numbersToPrint.begin(); i!= numbersToPrint.end(); i++) 
	        cout<<*i<<'\t'; 
	    cout<<endl;
	}
	return 0;
}
