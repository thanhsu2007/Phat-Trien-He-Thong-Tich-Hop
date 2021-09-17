package bt1;

import java.util.Scanner;

public class Diem {
	public static void main(String[] args) {
		try {
			int xA, yA;  // tọa độ điểm A
			int xO=0, yO=0;  //gán tọa độ điểm O
			double dodaiAO; // độ dài đoạn thắng AO
			Scanner sc = new Scanner(System.in);
	         
			System.out.println("Nhập tọa độ điểm A: ");
			System.out.println("Nhập hoành độ điểm A:");
			xA = sc.nextInt();
			System.out.println("Nhập tung độ điểm A: ");
			yA = sc.nextInt();
	         
	    // tính độ dài AB
			dodaiAO = Math.sqrt(Math.pow((xA - xO), 2) + Math.pow((yA - yO), 2));
			System.out.println("Độ dài đoạn thắng AO = " + dodaiAO);
	}catch (Exception e) {
		System.out.println(e);
	}
	}
}
