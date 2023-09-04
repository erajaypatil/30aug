package JavaStudy;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// Array concept
		//string array
		String st[]=new String[4];
		st[0]="Velocity";
		st[1]="Nanded";
		st[2]="Pune";
		st[3]="Pune";
		System.out.println(st[0]);//velocity
		System.out.println(st.length);//4
		//each loop
		for(String o:st)
		{
			System.out.println(o);
		}
		///for loop
		for(int i=0;i<=3;i++)
		{
			System.out.println(st[i]);
		}
		
		
		
		
		//char array
		char ch[]=new char[4];
		char ch1[]= {'a','b','c','d'};
		ch[0]='A';
		ch[1]='B';
		ch[2]='C';
		ch[3]='F';
		System.out.println(ch[3]);//f

		//object array
		
		Object ob[]=new Object[5];
		ob[0]="Ajay";
		ob[1]="Rahul";
		ob[2]='A';
		ob[3]=10.25;
		ob[4]=10;
		
		System.out.println(ob[2]);//A
		
		for(Object o1:ob)
		{
			System.out.print(o1);//Ajay Rahul A 10.25 10
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(ob[i]);
		}
		
		
		//int arrya
				int in[]=new int[4];
				int in1[]= {10,20,30,40,50,60};
				in[0]=10;
				in[1]=20;
				in[2]=30;
				in[3]=40;
				
				System.out.println(in[2]);//30
				
				//mutliple arry
				
				int in2[][]= {{10,20,30},{40,50,60,70},{80,90,100},{1,2,3,4}};
				System.out.println(in2[0][0]);//10
				System.out.println(in2[0][1]);//20
				System.out.println(in2[0][2]);//30
				System.out.println(in2[1][0]);//40
				System.out.println(in2[1][1]);//50
				System.out.println(in2[1][2]);//60
				System.out.println(in2[1][3]);//70
				System.out.println(in2[1][0]);//40
				System.out.println(in2[3][3]);//90
				System.out.println("Hi i am ajay ");
				System.out.println("hi this make changes in local reposity files");
				
	}
	

}
