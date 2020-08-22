package baekJoon_if;

import java.util.Scanner;

public class BaekJoon_14681 {
	public static void main(String[] args) {
		boolean check = false;
		while (!check) {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 || y == 0 || x > 1000 || x < (-1000) || y > 1000 || y < (-1000)) {
				System.out.println("-1000 <= x <= 1000 (x!=0) -1000 <= y <= 1000 (y!=0) 범위에 맞게 입력해주세요");
				}else {
				if (x > 0) {
					if (y > 0) {System.out.println("1");}
					else { System.out.println("4");}
				} else {
					if (y > 0) {System.out.println("2");}
					else {	System.out.println("3");}
				}
				sc.close();
				check=true;
			}
		}
	}
}
