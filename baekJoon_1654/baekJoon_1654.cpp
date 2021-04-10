// 집에서 시간을 보내던 오영식은 박성원의 부름을 받고 급히 달려왔다.
// 박성원이 캠프 때 쓸 N개의 랜선을 만들어야 하는데 너무 바빠서 영식이에게 도움을 청했다.
// 이미 오영식은 자체적으로 K개의 랜선을 가지고 있다. 
// 그러나 K개의 랜선은 길이가 제각각이다. 
// 박성원은 랜선을 모두 N개의 같은 길이의 랜선으로 만들고 싶었기 때문에
// K개의 랜선을 잘라서 만들어야 한다. 
// 예를 들어 300cm 짜리 랜선에서 140cm 짜리 랜선을 두 개 잘라내면 20cm는 버려야 한다.
// (이미 자른 랜선은 붙일 수 없다.)
// 편의를 위해 랜선을 자르거나 만들 때 손실되는 길이는 없다고 가정하며,
// 기존의 K개의 랜선으로 N개의 랜선을 만들 수 없는 경우는 없다고 가정하자.
// 그리고 자를 때는 항상 센티미터 단위로 정수길이만큼 자른다고 가정하자. 
// N개보다 많이 만드는 것도 N개를 만드는 것에 포함된다. 
// 이때 만들 수 있는 최대 랜선의 길이를 구하는 프로그램을 작성하시오.

#include<iostream>

using namespace std;
long long k; long long n; long long maxLength=0;

void searching(long long* lengthArr, long long Max, long long min){
    if(Max<min){
        return;
    }
    long long partition = (Max+min)/2;
   
    long long divide=0;
    for(int j=0;j<k;j++){
        divide += lengthArr[j] / partition;
    }
    if(divide>=n){
         if(partition>maxLength){
            maxLength=partition;
        }
        searching(lengthArr,Max,partition+1);
        // searching(lengthArr,partition-1,min);
    }else{
       searching(lengthArr,partition-1,min);
    }
}


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

   
    long long totalLength=0;

    cin >>k>>n;
    long long lengthArr[k];
    for(int i=0; i<k;i++){
        long long temp;
        cin>>temp;
        if(totalLength<temp){
            totalLength=temp;
        };
        lengthArr[i]=temp;
    }

   searching(lengthArr,totalLength,1);
   cout<<maxLength<<"\n";
   
}

// #include<iostream>
// #include<algorithm>
// using namespace std;
// long long k; long long n; long long maxLength=0;



// int main(){
//     ios_base::sync_with_stdio(false);
//     cin.tie(NULL);
//     cout.tie(NULL);

   
//     long long totalLength=0;

//     cin >>k>>n;
//     long long lengthArr[k];
//     for(int i=0; i<k;i++){
//         long long temp;
//         cin>>temp;
//         if(totalLength<temp){
//             totalLength=temp;
//         };
//         lengthArr[i]=temp;
//     }
//     long long low =1;
//     while(low<=totalLength){
//         long long mid =(low+totalLength)/2;
//         int cnt = 0;
// 	    for (int i = 0; i < k; i++){
// 		cnt += lengthArr[i] / mid;
//         }
//         if(cnt>=n){
//             if (maxLength < mid){
// 				maxLength = mid;
//             }
// 			low = mid + 1;
//         }else{
//             totalLength=mid-1;
//         }
//     }
//    cout<<maxLength<<"\n";
   
// }