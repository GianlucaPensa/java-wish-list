package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> wishlist;
		wishlist = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		char procedere = 's';
		
		while(procedere=='s') {
			System.out.println("Aggiungi elemento alla lista dei desideri: ");
			wishlist.add(scan.next());
			if(wishlist.size() == 1) {
			System.out.println("La tua lista contiene " + wishlist.size() + " desiderio");
			}
			else {
			System.out.println("La tua lista contiene " + wishlist.size() + " desideri");
			}
			System.out.print("Continuare ? (s/n) ");
			procedere = scan.next().charAt(0);
		}
		
		scan.close();
		
		System.out.println("Ecco la tua lista:");
		Iterator<String> lista = wishlist.iterator();
		while(lista.hasNext()) {
			System.out.println(lista.next());
		}

	}

}
