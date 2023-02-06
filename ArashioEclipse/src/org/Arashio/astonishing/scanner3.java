package org.Arashio.astonishing;

import java.util.Scanner;

public class scanner3 {

	public static void main(String[] args) {
		Scanner hero = new Scanner(System.in);
		while(hero.hasNextLine()) {
			System.out.println(hero.nextLine()+" Astonishes All over the world!!");
		}
		hero.close();

	}

}
