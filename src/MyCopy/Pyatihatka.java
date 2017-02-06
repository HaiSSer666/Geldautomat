package main1.copy;

public class Pyatihatka implements Babos{

	public static final int size = 500;
	public static final String name = "Пятихатка";
	public boolean identity;
	public int quality;
	
	public Pyatihatka(boolean i, int q) {
		identity=i;
		quality=q;
	}
	
	@Override
	public boolean getIdentity() {
		return identity;
	}
	
	@Override
	public int getQuality() {
		return quality;
	}

	@Override
	public int getAmout() {
		return size;
	}
	
	@Override
	public String getName() {
		return name;
	}

}
