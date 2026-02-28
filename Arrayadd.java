import java .util.ArrayList;
import java.util.Scanner;
class  Arrayadd{
	public static void main(String []args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		for(int i=0;i<size;i++) {
			list.add(scan.nextInt());
		}
		System.out.println("elements:"+list);
	}
}
