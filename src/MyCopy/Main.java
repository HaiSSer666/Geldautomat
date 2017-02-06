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
		
		System.out.println("���������� �������� ����� - "+list.size()+"\n");
		for (Babos b : list) {
			System.out.print("������ "+(list.indexOf(b)+1)+" "+b.getName()+" ");
			try{
				if(b1.accept(b)){
				sum += b.getAmout();
				}		
			}
				catch(QualityException e){
					 System.out.println(); 
					 System.out.println("������ ��������!");
					 System.out.println(e.getMessage()+"\n"+"�������� �������� ������: "+e.getQuality()+"\n");
			}
			
		}
		System.out.println("\n������� - "+b1.getP()+", �� ������� - "+b1.getN());
		System.out.println("����� ����� - " + sum);
	}
}
