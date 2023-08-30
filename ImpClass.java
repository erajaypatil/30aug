package JavaStudy;

public class ImpClass implements Interface{

	public static void main(String[] args) {
		
		ImpClass obj=new ImpClass();
		obj.method1();//10 //This is method1
		obj.method2();//Ajay // This is method2
		
		

	}
	
	
	
	
	public void method1()
	{
		System.out.println(a);//10
		System.out.println("This is method1");
	}
	
	
	public void method2()
	{
		System.out.println(name);//Ajay
		System.out.println("This is method2");
	}

}
