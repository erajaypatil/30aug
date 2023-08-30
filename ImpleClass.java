package JavaStudy;

public class ImpleClass implements GrandMother, mother,father{

	public static void main(String[] args) {
		
		ImpleClass im=new ImpleClass();
		im.cashGr();
		im.Grandmother();
		im.houseGr();
		
	
		im.mother();
		im.mothercash();
		im.motherhouse();
		
		im.cash();
		im.money();
		

	}
	
	
	

	public void money() {
		System.out.println("This is father money");
		
		
	}


	public void cash() {

		System.out.println("This is father cash");
		System.out.println("father method" + b);
		System.out.println(name);
		
	}


	public void mother() {
		System.out.println("This is mother method");
		System.out.println(nameM);
		
	}


	public void mothercash() {
		System.out.println("This is mothercash method");
		System.out.println(nameM);
		
	}


	public void motherhouse() {
		System.out.println("This is mother house method");
		System.out.println(nameM);
		
	}


	public void houseGr() {
	 System.out.println("This is houseGr method");
	 System.out.println(nameG);
		
	}




	public void cashGr() {
		
		System.out.println("This is cashGr");
		System.out.println(nameG);
		
	}




	public void Grandmother() {
		System.out.println("This is Grandmother method");
		System.out.println(nameG);
		
	}

}
