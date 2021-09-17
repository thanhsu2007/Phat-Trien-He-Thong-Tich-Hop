package bt1;
import java.util.Scanner;
public class b1 {
	public static void main(String[] args) {
		try {
			//class scanner để nhập dữ liệu từ bàn phím
			Scanner sc = new Scanner(System.in);
			String message;
			System.out.println("\n\nNhập vào chuỗi cần in hoa: ");
			message = sc.nextLine();
			//khai báo mảng và sử dựng toCharArray để chuyển đổi
			char[] charArray = message.toCharArray();
			//duỵet các phần tử trong mảng
			for(int i = 0; i < charArray.length; i++) {
				if(charArray[i] >= 97 && charArray[i] <= 122){
					charArray[i] -= 32;
				}
			}
			message = String.valueOf(charArray);
			System.out.println("Chuỗi sau khi đổi: \n" + message);
		
		}catch( Exception e) {
			System.out.println(e);
		}
	}	
}