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
		
		/*int sum = 0;
		List<Babos> list = new ArrayList<>();
		
		list.add(new Pyatihatka(true, 80));
		list.add(new Pyatihatka(true, 99));
		list.add(new Pyatihatka(false, 80));
		list.add(new Poltos(true, 54));
		list.add(new Poltos(false, 88));
		list.add(new Poltos(true, 93));
		
		System.out.println("Количество внесённых купюр - "+list.size());
		for (Babos b : list) {
			System.out.print("Купюра "+(list.indexOf(b)+1)+" "+b.getName()+" ");
			
			if(b1.accept(b)){
				sum += b.getAmout();
			}
		}
		System.out.println("Принято - "+b1.getP()+", не принято - "+b1.getN());
		System.out.println("Общая сумма - " + sum);*/
	}
}
