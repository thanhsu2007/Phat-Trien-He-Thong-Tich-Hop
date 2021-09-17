package bt1;
import java.util.Scanner;
public class b4 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
			int num, sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập n: ");
			num = sc.nextInt();
			for(int i = 1; i <= num; ++i)
			{
            // sum = sum + i;
				sum += i;
			}
			System.out.println("Tổng các số tự nhiên từ 1 đến "+ num +" là: "+sum);
			}catch(Exception e) {
				System.out.println(e);
			}
		}

}
