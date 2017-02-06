package main1.copy;

public class QualityException extends Exception{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int quality;
	    
	    public QualityException(String message, int q){
	        super(message);
	        quality=q;
	    }

		public int getQuality() {
			return quality;
		}
	    
}

