#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

bool comp(string a, string b){
    if(a.length()==b.length()){
        return a.compare(b)<0;
    }
    return a.length()<b.length();
};


int main(){
     ios_base::sync_with_stdio(false);
     cin.tie(NULL);
     cout.tie(NULL);
     
     int wordCnt ;
     cin>>wordCnt;
     string temp;
     vector<string> wordArr;
     for(int i =0; i<wordCnt;i++){
         cin >> temp;
         wordArr.push_back(temp);
        
     }
    sort(wordArr.begin(),wordArr.end(),comp);
    vector<string>::iterator enditer;
    vector<string>::iterator startiter;
    enditer=unique(wordArr.begin(),wordArr.end());
    for(startiter=wordArr.begin();startiter!=enditer;startiter++){
        cout<<*startiter<<"\n";
    }
}

