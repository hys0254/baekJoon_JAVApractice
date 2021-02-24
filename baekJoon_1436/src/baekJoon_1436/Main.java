package baekJoon_1436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int place = Integer.parseInt(br.readLine());
	
		int i =1;
		int count=0;
		while(true) {
			String num=Integer.toString(i);
			if(num.contains("666")) {
				count++;
			}
			if(count==place) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
