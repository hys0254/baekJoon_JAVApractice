#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    vector<string> intArr;
    vector<string> rev_intArr;
    string temp;
    cin>>temp;
    while(temp!="0"){
        intArr.push_back(temp);
        reverse(temp.begin(),temp.end());
        rev_intArr.push_back(temp);
        cin>>temp;
    }
    
    for(int i=0;i<intArr.size();i++){
        if(intArr[i]==rev_intArr[i])
        cout<<"yes"<<"\n";
        else
        cout<<"no"<<"\n";
    }



}
