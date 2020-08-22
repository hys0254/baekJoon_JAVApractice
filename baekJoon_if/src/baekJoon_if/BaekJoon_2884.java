package baekJoon_if;

import java.util.Scanner;

public class BaekJoon_2884 {
	public static void main(String[] args) {
		boolean check = false;
		while (!check) {
			Scanner sc = new Scanner(System.in);
			int HH = sc.nextInt();
			int	MM = sc.nextInt();
			
			if (HH > 23 || HH < 0 || MM> 59 || MM < 0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			} else {
				if (MM < 45) {
					
					HH--;
					if(HH<0) {
						HH=23;
					}
					MM = 15+MM;
					
				} else {
					MM-=45;
				}
				System.out.println(HH+" "+MM);
				sc.close();
				check = true;
			}
		}
	}
}
