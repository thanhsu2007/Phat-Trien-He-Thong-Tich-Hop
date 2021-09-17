package bt1;
import java.util.Scanner;
public class b2 {
	boolean kiemtrasnt(int n){
		  for(int i =2; i<=Math.sqrt(n);i++){
		   if(n%i == 0){
		    return false;
		   }
		  }
		  return true;
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Scanner sc = new Scanner(System.in);
			  System.out.printf("Nhap vao so nguyen duong \n");
			  int n = sc.nextInt();
			  b2 snt = new b2();
			  if(snt.kiemtrasnt(n)){
			   System.out.printf("So : " +n +" la so nguyen to");
			  }else{
			   System.out.printf("So : " +n +" khong phai la so nguyen to");
			  }
		}catch(Exception e) {
			System.out.println(e);
	}
	}
}
