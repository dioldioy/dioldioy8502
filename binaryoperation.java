package cbsc;
public class binaryoperation {
	static String number[][]= new String[51][3];
	static int out[] = new int[51];
	
	public  void printHeader()
	{
		System.out.println("��������ʮ���Ӽ���������");
	}
	
	public  void generateEquations()//������ʽ
	{
		int a;
		int b;
		int c;
		int j;
		for(int i = 0;i < 50;i ++) {
			do {
				a = (int)(Math.random()*101);
				b = (int)(Math.random()*101);
			}while((a + b>100)||(a - b<0));
			
			number[i][0] = String.valueOf(a);
			number[i][2] = String.valueOf(b);
			c=(int)(Math.random()*2);
			if(c==1) {
				number[i][1] = "+";
				out[i] = a+b;
			}
			else
			{
				number[i][1] = "-";
				out[i] = a-b;
			}
			
			for(j=0;j<i;j++)
			{
				String t1 = number[i][0]+ number[i][1] + number[i][2];
				String t2 = number[i][2] + number[i][1] + number[i][0];
				String t3 = number[j][0]+number[j][1]+number[j][2];
				if(t1==t3||t2==t3) {
					break;
				}
			}
			if(j!=i) {
				i--;
			}
		}

	}
	public void output() {	//������
		for(int i=0;i<50;i++) {
			System.out.print("��"+(i+1)+"����Ĵ�Ϊ��"+out[i]+"\t\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}

	public void out() {	//�����ʽ
		for(int i=0;i<50;i++) {
			System.out.print("��"+(i+1)+"����:"+number[i][0]+number[i][1]+number[i][2]+"\t\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		binaryoperation s = new binaryoperation();
		s.printHeader();
		s.generateEquations();
		s.out();
		s.output();
	}
	
}
