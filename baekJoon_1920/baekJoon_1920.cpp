#include<iostream>
#include<algorithm>

using namespace std;

int intArr[1000000];
int resultArr[1000000];

void searching(int target, int first, int last,int cnt){
    int start=first;
    int end=last;
    while(start<=end){
        int partition = (start+end)/2;
        if(intArr[partition]==target){
            resultArr[cnt]=1;
            return;
        }else if(intArr[partition]<target){
            start=partition+1;
        }else{
            end = partition-1;
        }
    }
    resultArr[cnt]=0;
    return;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N; int M;

    cin>>N;

    for(int i =0; i<N; i++){
        cin>>intArr[i];
    }
    
    sort(intArr,intArr+N);
    cin>>M;

    for(int i =0;i<M;i++){
        int temp;
        cin >> temp;
        searching(temp,0,N-1,i);
    }
  
    for(int i =0;i<M;i++){
        cout<<resultArr[i]<<"\n";
    }
    
}