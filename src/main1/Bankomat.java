package main1;

import java.util.*;

public class Bankomat implements acceptable{
	//private int sum = 0;
	private boolean s;
	int n, p;
	private List<Babos> currentTransaction = new ArrayList<>();
	private List<Babos> totalAmount = new ArrayList<>();
	
	@Override
	public boolean accept(Babos b) {
		if (b.getIdentity() && b.getQuality()>75){
			currentTransaction.add(b);
			System.out.print(b.getName()+ " принята. \n");
			s = true;
			p++;
			}
		else{
			System.out.print(b.getName()+ " не принята. \n");
			s = false;
			n++;
		}
		return s;
	}

	public int getN() {
		return n;
	}

	public int getP() {
		return p;
	}

	public int commitCurrentTransaction(){
		int sum=0;
		for(Babos b : currentTransaction){
			sum+=b.getAmout();	
		}
		totalAmount.addAll(currentTransaction);
		currentTransaction = new ArrayList<>();
		System.out.print("добавлено - ");
		return sum;
	}
	
	public int declineCurrentTransaction(){
		int sum=0;
		for(Babos b : currentTransaction){
			sum+=b.getAmout();	
		}
		currentTransaction = new ArrayList<>();
		System.out.print("отклонено - ");
		return sum;
	}
	
	public int getTotalAmount(){
		int sum=0;
		for(Babos b : totalAmount){
			sum+=b.getAmout();	
		}
		return sum;
	}
	
/*	@Override
	public int count(Babos b) {
		if(s){
			sum+=b.getAmout();
		}
		return sum;
	}*/
}