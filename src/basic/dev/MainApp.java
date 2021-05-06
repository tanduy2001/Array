package basic.dev;
/**
 * Lab13
 * @author Admin
 *
 */
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x =  new int [10];
		inputArr(x);
		expArr(x);
		tinhTongChanLe(x);
		countChanLe(x);
		shortInc(x);
		shortDec(x);
		find(x);
		prime(x);
		
	}
	
	public static void inputArr( int []x) {
	Scanner sc =new Scanner(System.in);
	
		for(int i = 0 ; i < x.length; i++) {
		System.out.printf("Nhap vao A[%d] = ", i);
		x[i] = sc.nextInt();
		}
	}
	static void expArr(int []x) {
		for(int i = 0 ; i < x.length; i++) {
			System.out.printf("%d\t ", x[i]);
		}
	}
	static void tinhTongChanLe(int []x) {
		int sum = 0;
		
		for(int i = 0 ; i < x.length ; i ++) {
		sum += x[i];
		}
		if(sum % 2 == 0 ) {
			System.out.println("\nTong cua mang la chan");
		}	else {
			System.out.println("\nTong mang la le\n");
			}
	}
	static void countChanLe(int [] x) {
		int countC = 0;
		int countL = 0;
		
		for(int i = 0 ; i < x.length ; i++) {
			if(x[i] % 2 == 0) {
				countC++;
			}	else {
				countL++;
				}
		}
		System.out.printf("Mang co so so chan la: %d, Co so so le la %d\n ",countC,countL);
	}
	static void shortInc(int []x) {
		int temp = x[0];
		
		for(int i = 0 ; i < x.length; i++) {
			for(int j = i + 1 ; j < x.length ; j++) {
				if(x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		
		}
		System.out.println("Mang tang dan la:\n");
		for(int i = 0 ; i < x.length ; i++) {
			System.out.printf("%d\t",x[i]);
		}
	}
	static void shortDec(int []x) {
		int temp = x[0];
		
		for(int i = 0 ; i < x.length; i++) {
			for(int j = i + 1 ; j < x.length ; j++) {
				if(x[i] < x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		
		}
		System.out.println("\nMang giam dan la:");
		for(int i = 0 ; i < x.length ; i++) {
			System.out.printf("%d\t",x[i]);
		}

	}
	static void find(int[] x) {
		int currentIndex = 0;
		int count = 1;
		int prevValue = x[0];
		int prevCount = 0;
		
		for (int i = 0; i < x.length-1; i++) {
			if(x[i] == x[i+1]) {
				count++;
			}else {
				if(count > prevCount) {
					prevCount = count;
					prevValue = x[i];
					count = 1;
				}

				currentIndex = i;
			}
		}
		
		if(count > prevCount) {
			prevCount = count;
			prevValue = x[currentIndex + 1];
		}
		System.out.println(String.format("\nPhan tu %d xuat hien %d lan", prevValue, prevCount));
	}
	static void prime(int []x) {
		System.out.println("day cac phan tu la cac so nguyen to trong mang la:\n");
		boolean check = true;
		int count=0;
		for(int i = 0 ; i < x.length ; i++) {
			check = true;
			for(int j = 2; j < x[i] ; j++) {
				if(x[i] % j == 0 ) {
					check = false;
				}
			}
			if((check == true) && (x[i] > 1)) {
				System.out.printf("%d\t",x[i]);
				count++;
			}
		}
		System.out.printf("\nCo %d phan tu la cac so nguyen to ", count);
	}

}
