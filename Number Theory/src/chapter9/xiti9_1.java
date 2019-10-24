package chapter9;

public class xiti9_1 {
	public static void main(String[] args) {
		for(int x=0;x<29;x++) {
			if(Math.pow(x, 2)%29==6) {
				System.out.println(x);
			}
		}
		for(int x=0;x<13;x++) {
			if(Math.pow(x, 3)%13==3) {
				System.out.println(x);
			}
		}
	}
}
