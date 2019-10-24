package chapter10;

public class eularfunc {
	static int phi[]=new int[1000];
//	static void euler(int n)
//	{
//	    for (int i=1;i<=n;i++) phi[i]=i;
//	    for (int i=2;i<=n;i++)
//	    {
//	        if (phi[i]==i)//这代表i是质数
//	        {
//	            for (int j=i;j<=n;j+=i)
//	            {
//	                phi[j]=phi[j]/i*(i-1);//把i的倍数更新掉
//	            }
//	        }
//	    }
//	}
	void euler(int n)
	{
		phi[1]=1;//1要特判 
		for (int i=2;i<=n;i++)
		{
			if (flag[i]==0)//这代表i是质数 
			{
				prime[++num]=i;
				phi[i]=i-1;
			}
			for (int j=1;j<=num&&prime[j]*i<=n;j++)//经典的欧拉筛写法 
			{
				flag[i*prime[j]]=1;//先把这个合数标记掉 
				if (i%prime[j]==0)
				{
					phi[i*prime[j]]=phi[i]*prime[j];//若prime[j]是i的质因子，则根据计算公式，i已经包括i*prime[j]的所有质因子 
					break;//经典欧拉筛的核心语句，这样能保证每个数只会被自己最小的因子筛掉一次 
				}
				else phi[i*prime[j]]=phi[i]*phi[prime[j]];//利用了欧拉函数是个积性函数的性质 
			}
		}
	}

	public static void main(String[] args) {
		euler(100);
	}

}
