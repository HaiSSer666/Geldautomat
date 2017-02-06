package main1.copy;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int sum = 0;
		List<Babos> list = new ArrayList<>();
		
		Bankomat b1 = new Bankomat();
		System.out.println(b1.setHello());
		
		list.add(new Pyatihatka(true, 80));
		list.add(new Pyatihatka(true, 99));
		list.add(new Pyatihatka(false, 80));
		list.add(new Poltos(true, 84));
		list.add(new Poltos(false, 60));
		list.add(new Poltos(true, 93));
		
		System.out.println("Количество внесённых купюр - "+list.size()+"\n");
		for (Babos b : list) {
			System.out.print("Купюра "+(list.indexOf(b)+1)+" "+b.getName()+" ");
			try{
				if(b1.accept(b)){
				sum += b.getAmout();
				}		
			}
				catch(QualityException e){
					 System.out.println(); 
					 System.out.println("ОШИБКА КАЧЕСТВА!");
					 System.out.println(e.getMessage()+"\n"+"Качество внесённой купюры: "+e.getQuality()+"\n");
			}
			
		}
		System.out.println("\nПринято - "+b1.getP()+", не принято - "+b1.getN());
		System.out.println("Общая сумма - " + sum);
	}
}
