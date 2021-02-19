package baekJoon_10872;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BaekJoon10872 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int startNum = Integer.parseInt(br.readLine()); 
		System.out.println(factorial(startNum));
	}
	public static int factorial(int exNum) {
		if(exNum==0) return 1;
		return exNum*factorial(exNum-1);
	}
}

