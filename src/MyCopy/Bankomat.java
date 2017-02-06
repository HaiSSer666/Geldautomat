package main1.copy;

public class Bankomat implements acceptable{

	Country c;
	private boolean s;
	int n, p;
	
	public Bankomat (){
		this(Country.USA);
		System.out.println("English was chosen as a default langauge!");
	}
	
	public Bankomat (Country c){
		this.c = c;
	}
	
	@Override
	public boolean accept(Babos b) throws QualityException{
		if (b.getQuality()<0){
			s = false;
			n++;
			throw new QualityException("Качество ниже 0 - это орочье качество. Попробуйте ещё раз", b.getQuality());	
		}
		else{
			if (b.getIdentity() && b.getQuality()>75){
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
			}

	public String setHello(){
		String s = " ";
		
		switch (c) {
		case UKRAINE:
			s = "Вітаю!";
			break;
		case GERMANY:
			s = "Wilkommen!";
			break;
		case USA:
			s = "Welcome!";
			break;
		case JAPAN:
			s = "こんにちは!";
			break;
		default:
			s = "Welcome!";
		}
		return s;
		
	}
	
	public int getN() {
		return n;
	}

	public int getP() {
		return p;
	}	
}