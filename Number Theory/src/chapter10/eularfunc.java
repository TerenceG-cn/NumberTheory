package chapter10;

public class eularfunc {
	static int phi[]=new int[1000];
//	static void euler(int n)
//	{
//	    for (int i=1;i<=n;i++) phi[i]=i;
//	    for (int i=2;i<=n;i++)
//	    {
//	        if (phi[i]==i)//�����i������
//	        {
//	            for (int j=i;j<=n;j+=i)
//	            {
//	                phi[j]=phi[j]/i*(i-1);//��i�ı������µ�
//	            }
//	        }
//	    }
//	}
	void euler(int n)
	{
		phi[1]=1;//1Ҫ���� 
		for (int i=2;i<=n;i++)
		{
			if (flag[i]==0)//�����i������ 
			{
				prime[++num]=i;
				phi[i]=i-1;
			}
			for (int j=1;j<=num&&prime[j]*i<=n;j++)//�����ŷ��ɸд�� 
			{
				flag[i*prime[j]]=1;//�Ȱ����������ǵ� 
				if (i%prime[j]==0)
				{
					phi[i*prime[j]]=phi[i]*prime[j];//��prime[j]��i�������ӣ�����ݼ��㹫ʽ��i�Ѿ�����i*prime[j]������������ 
					break;//����ŷ��ɸ�ĺ�����䣬�����ܱ�֤ÿ����ֻ�ᱻ�Լ���С������ɸ��һ�� 
				}
				else phi[i*prime[j]]=phi[i]*phi[prime[j]];//������ŷ�������Ǹ����Ժ��������� 
			}
		}
	}

	public static void main(String[] args) {
		euler(100);
	}

}
