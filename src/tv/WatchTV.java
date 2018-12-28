package tv;


public class WatchTV {
	public static void main(String[] args) {

		TV tv = new TV(7, 20, false);  	
	    
	    tv.status(); // TV[power=false, channel=7, volume=20]
	    
	    tv.power( true );
	    tv.volume( 120 );
	    tv.status(); // TV[power=true, channel=7, volume=0]          
	    
	    tv.volume( false );
	    tv.status(); // TV[power=true, channel=7, volume=50]
	    
	    tv.channel( 0 );
	    tv.status(); // TV[power=true, channel=0, volume=50]       
	    
	    tv.channel( true ); // channel++;
	    tv.channel( true ); // channel++;
	    tv.channel( true ); // channel++;
	    tv.status(); // TV[power=true, channel=3, volume=50]

	    tv.power( false );
	    tv.status(); //TV[power=false, channel=3, volume=50]

	}
}
