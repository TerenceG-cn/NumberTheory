package chapter3;
//3.1 (c) 
public class gougu3 {
	public static void main(String[] args) {
		System.out.println("(u,v)    (a,b,c)");
		System.out.println("------------------------");
		for (int v = 1; v < 10; v++)
			for (int u = v + 1; u <= 10; u++) {
				int a = (int) (Math.pow(u, 2) - Math.pow(v, 2));
				int b = 2 * u * v;
				int c = (int) (Math.pow(u, 2) + Math.pow(v, 2));
				if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
					System.out.println("("+u+","+v+")    "+"(" + a + "," + b + "," + c + ")");
			}
	}
}
