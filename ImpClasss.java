package JavaStudy;

public class ImpClasss implements IterfaceStudy {

	public static void main(String[] args) {
		
		System.out.println(a);//20
		System.out.println(name);//ajay
		System.out.println(c);//A
		
		
		ImpClasss  im=new ImpClasss();
		im.m1();
		im.m2();
		im.m5("Rokade");
		im.m4();
		im.m3();

	}
	
	public void m1()
	{
		String name="Rokade";
		System.out.println("m1 method is completed "+ name);
	}
	
	public void m2()
	{
		String name="Patil";
		System.out.println("m2 method is completed" +name);
	}
	
	public void m5(String name)
	{
		name="Ashish";
		System.out.println("m5 method is completed" +name);
		
	}
	
	public void m4()
	{
		String name="Ajay";
		System.out.println(name +"m4 methods of own impl class ");
	}

	public void m3() {
		
		System.out.println("m3 method is completed");
		
	}

}
