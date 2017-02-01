package main1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Bankomat b1 = new Bankomat();
		
		b1.accept(new Pyatihatka(true, 80));
		b1.accept(new Poltos(true, 88));
		System.out.println(b1.commitCurrentTransaction());
		
		b1.accept(new Poltos(true, 80));
		b1.accept(new Poltos(false, 88));
		System.out.println(b1.commitCurrentTransaction());
		
		b1.accept(new Pyatihatka(true, 55));
		System.out.println(b1.commitCurrentTransaction());
		
		b1.accept(new Poltos(true, 80));
		b1.accept(new Poltos(true, 88));
		System.out.println(b1.declineCurrentTransaction());
		
		System.out.println(b1.getTotalAmount());
	}
}
