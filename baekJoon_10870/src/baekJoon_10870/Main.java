package baekJoon_10870;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fibotimes = Integer.parseInt(br.readLine()); 
		System.out.println(fibo(fibotimes));
	}
	public static int fibo(int fibotimes) {
		if(fibotimes==0) {
			return 0;
		}else if (fibotimes==1) {
			return 1;
		}
		return fibo(fibotimes-1)+fibo(fibotimes-2);
	}
}
