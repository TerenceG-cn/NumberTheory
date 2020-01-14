package chapter07;
//分解正整数为素数乘积
public class xiti7_7 {
	public static void main(String[] args) {
		for(int i=1000000;i<1000031;i++) {
			System.out.print(i+" = ");
			fun(i);
		}
    }
    public static void fun(int num){
        int i=2;
        if(num==i){
            System.out.println(num);
            return;
        }else{
            while(true){
                if(num%i==0){
                    System.out.print(i+"*");
                    fun(num/i);
                    return;
                }else{
                    i++;
                    if(i==num){
                        System.out.println(num);
                        return;
                    }
                }
            }
        }
    }
}
