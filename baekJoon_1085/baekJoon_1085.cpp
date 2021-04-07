#include<iostream>

using namespace std;

void findRoute(int x , int y , int w , int h );

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int x ; int y ; int w ; int h;

    cin>> x >> y >> w >> h ;


    findRoute(x,y,w,h);


}


void findRoute(int x , int y , int w , int h ){
   int minRoute=min(min(w-x,x),min(h-y,y));
   cout<<minRoute;

}