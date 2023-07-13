class Metro{

         static int index;
		 
		static String stationNames[] = {null,null,null,null,null,null,null};
		
	public static boolean addStations(String station){
		
		boolean isAdded = false;
		
		if(station != null){
			
			stationNames[index] = station;
			index ++;
			
		}else{
			System.out.println("Null values can't Added");
		}	
		
		return isAdded;
	}
	
	public static void saveAllStationNames(){
		
		for(int stationName = 0; stationName< stationNames.length; stationName++){
			
			String reference = stationNames[stationName];
			
			System.out.println("The  " + reference + "  Station Names Has Been Saved");
		
		
		
	}
	
		
		
		
		
		
	}	
		
		
		
		
		
		
		
		
}
