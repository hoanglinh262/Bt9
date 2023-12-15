package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e;
		try (Scanner sc = new Scanner(System.in)) {
			e = sc.nextInt();
			if (e >0) {
				System.out.println(e +" La so duong");
				if (e <0) {
					System.out.println(e +" La so am");	
				}
				int n;
				n = sc.nextInt();
				if (n % 5 == 0) {
					System.out.println(n + " chia het cho 5 ");
				} else if (n % 3 == 0) {
					System.out.println(n + " chia het cho 3");
				} else {
					System.out.println(n + " khong chia het cho 3 va 5");
				}
				int d;
				System.out.println("Nhap vao thang:");
				d = sc.nextInt();
				switch (d) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("Tháng " + d + " có 31 ngày.");
					break;

				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Tháng " + d + " có 30 ngày.");
					break;

				// Riêng tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
				case 2:
					int year;
					System.out.println("Mời bạn nhập năm: ");
					year = sc.nextInt();
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						System.out.println("Tháng " + d + " năm " + year + " có 29 ngày.");
					} else {
						System.out.println("Tháng " + d + " năm " + year + " có 28 ngày.");
					}
					break;
				}
					double a,b,c,x1,x2,delta;
					System.out.println("Nhap vao a=");
					a = sc.nextDouble();
					System.out.println("Nhap vao b=");
					b = sc.nextDouble();
					System.out.println("Nhap vao c=");
					c = sc.nextDouble();
					
					delta = Math.pow(b, 2) - 4 * a * c;
					
					if(a == 0) {
						System.out.println("Nhập dữ liệu sai!");
					} else {
					if (delta<0) {
						System.out.println("Phương trình vô nghiệm!");
					}else if(delta==0) {
						x1 = -b/(2*a);
						System.out.println("Phương trình có nghiệm kép x1=x2="+x1);
					}else {
						x1 = (-b - Math.sqrt(delta))/(2*a);
						x2 = (-b - Math.sqrt(delta))/(2*a);
						System.out.println("Phương trình có nghiệm");
						System.out.println("x1="+ x1);
						System.out.println("x2="+ x2);
					}
				int h,j,k;
				System.out.println(" Nhap vao canh thu 1:");
				h= sc.nextInt();
				System.out.println(" Nhap vao canh thu 2:");
				j= sc.nextInt();
				System.out.println(" Nhap vao canh thu 3:");
				k= sc.nextInt();
				if ((h + j > k) && (h + k > j) && (j + k > h) &&
						(h>0) && (j>0) && (k>0)) {
				
				System.out.println(" Day la tam giac ");
				}
		}
			}
		}
	}
}
	



	



