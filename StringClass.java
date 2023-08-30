package JavaStudy;



public class StringClass extends String1 {

	public static void main(String[] args) {
		//String parctise
		
		String name="Ajay";
		String name1="Ajay";
		
		name.charAt(1);
		System.out.println(name.charAt(1));
		name.codePointAt(3);
		System.out.println(name.codePointAt(3));
		name.compareTo(name1);
		System.out.println(name.compareTo(name1));//
		name.length();
		System.out.println(name.length());//
		System.out.println(name.replace(name,"Ashok"));
		System.out.println(name);//Ajay
		
		
		
	
		

	}

}
