package org.Arashio.booleantraining;

public class BooleanTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(100-1==99); //True
		System.out.println(100-1==0); //False
		System.out.println(3<8*111); //True
		String a = "Arashio astonishes all over the world!!";
		String b = "Asashio astonishes all over the world!!";
		String c = new String ("Arashio astonishes all over the world!!");
		System.out.println(a.equals(c)); //True
		System.out.println(a==c); //False
		System.out.println(a.equals(b)); //False
		if (a.equals(b)) {
			System.out.println(c);
		}
		else {
			System.out.println("BOOOOO");
		}

	}

}
