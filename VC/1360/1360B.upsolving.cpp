#include<iostream> 
#include<vector> 
#include<algorithm> 
using namespace std;
int main(){ 
    int tc; 
    cin>>tc;  
    while(tc--){ 
        int n;   
        int min = 9999;
        vector<int> vec; 
        cin>>n;  
        while(n--){ 
            int ele; 
            cin>>ele; 
            vec.push_back(ele); 
        } 
        sort(vec.begin(),vec.end(),greater<int>());  
        // for (auto i = vec.begin(); i < vec.end(); i++)
        // {
        //     cout<<*i<<" ";
        // }  
        // cout<<endl;
        for (auto i = vec.begin(); i < vec.end()-1; i++)
        {   
           // cout<<*i<<"Is first element"<<endl; 
           // cout<<*(i+1)<<"Is the second element"<<endl; 
            int a = *i; 
            int b = *(i+1); 
            if( (a-b)<min) 
                min=(a-b);  
            //cout<<"Min is"<<min<<endl;
        } 
        cout<<min<<endl;
    } 
    
}