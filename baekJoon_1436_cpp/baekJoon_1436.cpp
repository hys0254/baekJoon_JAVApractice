#include<iostream>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int numbering;
    cin>>numbering;
    int i=666;
    int finding=0;
    while(1){
        if(to_string(i).find("666")==string::npos){
            i++;
            continue;
        }
        finding++;
        if(numbering==finding){
            cout<<i<<"\n";
            break;
        }
        i++;

    }


}
