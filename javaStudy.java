package JavaStudy;

import java.lang.reflect.Array;

public class javaStudy {

	public static void main(String[] args) {
		//Array is use to store homogeniuos values
		//Array are fixed in size they are not growable
		//Array declare in two ways
		//one dimensional - array ar[]=new array[5];
		//two dimensional- arrya ar[][]=new array[4][2];
		
		
		int ar[]=new int[5];
		ar[0]=10;
		ar[3]=50;
		ar[4]=60;
		System.out.println(ar[0]);//50
		
		int ar1[]= {10,20,30,40,50};
		System.out.println(ar1[4]);//30
		
		char ch[]= {'A','b','C','D'};
		System.out.println(ch[3]);//D
		
		String str[]= {"Ajay","Rokade","patil"};
		System.out.println(str[1]);//Rokade
		
		
		
		
		

	}

}
