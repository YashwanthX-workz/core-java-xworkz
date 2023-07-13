class Speaker{

    static String name = "JBL";
	static int minVolume ;
	static int currentVolume;
	static int maxVolume = 10;
	static boolean isConnected;
	
	// method
	
	public static void main(String jbl[]){
	
	
	}
	 
	 
	public static boolean onOrOff(){
	 System.out.println("Invoking onOrOff \n");
	  System.out.println("The Speaker Name Is:"+name);
	  if(isConnected == false){
	           isConnected = true;
	  System.out.println("It is Connected.... \n");
	  }else if(isConnected == true){
	           isConnected = false;
	  
	  
	  System.out.println("It is Not Connected");
	 
	  }
	return isConnected;
	}
	 
	 
	 // Increase volume 
     //Decrease volume
	 
	 public static void increseVolume(){
		 
		 if(isConnected==true){
		 if(currentVolume< maxVolume){
			 
			 currentVolume = currentVolume + 1;
			 System.out.println(currentVolume);
		 }else{
			 
			 System.out.println("Max Volume reached...");
		 }
		 }else{
			
	 }
	 }
		 
	public static void decreseVolume(){
		 
		 if(isConnected == true){
		 if(currentVolume> minVolume){
			 
			 currentVolume = currentVolume - 1;
			 System.out.println(currentVolume);
		 }else{
			 
			 System.out.println("minVolume Volume reached...");
		 }
		 }else{
			 System.out.println("Guru Speaker Connect madu...");
		 }	 
	}
		 
		 
	 }
	
	 