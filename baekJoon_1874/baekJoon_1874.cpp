#include<iostream>
#include<vector>
#include<stack>


using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int n;
    cin>>n;
    
    vector<char> resultArr;
    stack<int>  intStack;
    int temp=0;
    int lastsmall=0;
    for(int i =0;i<n;i++){
        cin>>temp;
       if(temp>lastsmall){
           for(int j=lastsmall+1;j<=temp;j++){
               intStack.push(j);
               resultArr.push_back('+');
           }
       }else{
           if(intStack.top()!=temp){
               cout<<"NO"<<"\n";
               return 0;
           }
       }
       intStack.pop();
       resultArr.push_back('-');
       if(lastsmall<temp){lastsmall=temp;}
    }    
    vector<char>::iterator startIter;
    
    startIter=resultArr.begin();
    for(startIter;startIter!=resultArr.end();startIter++){
        cout<<*startIter<<"\n";
    }

}