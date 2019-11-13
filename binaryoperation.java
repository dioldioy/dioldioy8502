package cbsc;
public class binaryoperation {
	static String number[][]= new String[51][3];
	static int out[] = new int[51];
	
	public  void printHeader()
	{
		System.out.println("随机输出五十到加减法计算题");
	}
	
	public  void generateEquations()//生成算式
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
	public void output() {	//输出结果
		for(int i=0;i<50;i++) {
			System.out.print("第"+(i+1)+"道题的答案为："+out[i]+"\t\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}

	public void out() {	//输出算式
		for(int i=0;i<50;i++) {
			System.out.print("第"+(i+1)+"道题:"+number[i][0]+number[i][1]+number[i][2]+"\t\t");
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
