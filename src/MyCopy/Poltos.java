package main1.copy;

public class Poltos implements Babos{

	public static final int size = 50;
	public static final String name = "Полтос";
	public boolean identity;
	public int quality;
	
	public Poltos(boolean i, int q) {
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
	public String getName() {
		return name;
	}

	@Override
	public int getAmout() {
		return size;
	}

}
