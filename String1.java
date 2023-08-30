package JavaStudy;



public class String1 {
	
	public static void main(String[] args) {
		
		String str="ajay";
		String str1="Ajay";
		String str2="Rokade";
		String str3="45jdhs";
		str.length();
		System.out.println(str.length());
	StringBuffer st=new StringBuffer(str);
    System.out.println(st.reverse());
	StringBuilder s=new StringBuilder(str);
	System.out.println(s.reverse());
	System.out.println(str3);
	
	
	String s3=new String("Ajay rokade + Ashish rokade");
	String s1=new String("Rokade");
	String s2=new String("City");
	String s4=new String("City");
	System.out.println(s3.concat(str3));
	System.out.println(str==str1);//false
	System.out.println(str.equalsIgnoreCase(str3));
	
	String str5="i am learning learning java java java program";
	String str6="iam,learining";
	System.out.println(str6.length());//11
	System.out.println(str5.length());//45
	System.out.println(str6);//
	System.out.println(str6.split(","));
	System.out.println(s2.replace("City","pune"));//
	System.out.println(s2.lastIndexOf("y"));//3
	System.out.println(s2.indexOf("y"));//3
	
	System.out.println(s2.concat(str5));
	System.out.println(s2.equals(s4));//true
	System.out.println(s2==s4);//false
	
	//equalcase equalignorcase concat split replace touppercase tolowecase startwith endwith length charAt indexof
	//lastindexof 
	
	
		for(int i=4;i>=0;i--)
		{
			System.out.println(i);//43210
		}
		
		String name1 = "ajay";
		for(int name=name1.length(); name>=0; name--)
		{
			System.out.println(name1);//
		}
		
		int leng = name1.length();
		Object rev = null;
		
		for(int i=leng-1;i>=0;i--)
		{
			 rev=name1.charAt(i);
			 
		}
		System.out.println(rev);
		
	//	StringBuffer obj=new StringBuffer(name1);
	//	System.out.println(obj.reverse());
		
		
		String sp="I Love My India";
		String spl=" ";
		String[] splitt = sp.split(spl);
		System.out.println(splitt[2]);
	}

}
