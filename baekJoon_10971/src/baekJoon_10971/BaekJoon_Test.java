package baekJoon_10971;
import java.util.Scanner;

public class BaekJoon_Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //도시간 이동 비용 행렬 W
        int[][] W;

        //이동 비용 최종값 저장
        int result=0;

        //도시 개수 N입력 (2<= N <=10)
        int N = sc.nextInt();

        //행렬  W입력받기
        W=new int[N][N];
        for (int i = 0; i < W.length; i++) {
            for (int j = 0; j < W[0].length; j++) {
                W[i][j]=sc.nextInt();
            }
        }

        //들렸던 도시인지 확인하는 배열
        int[] visit = new int[N];
        visit[0]=1;
        int a = 0;
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            for (int j = 0; j < N; j++) {
                if(visit[j]==1) {continue;}
                else if(W[a][j]==0) {continue;}
                visit[j]=1;
                tmp+=W[a][j];
                if(tmp>=result) {
                    result = tmp;
                }
                a=j;
            }
        }

        System.out.println("최소값 : "+result);



    }

}
