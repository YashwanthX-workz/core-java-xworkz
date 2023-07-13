class Karnataka{
	
	
	static int index;
	//Array has limitation- size is fixed
	static String cityNames[] = {null,null,null,null,null,null,null};
	
	public static boolean addCityNames(String cityName){
		boolean isCreated = false;
		if(cityNames.length > index){
			
		   if(cityName != null){
			   cityNames[index] = cityName;
		   index ++;
		   isCreated = true;
		     //System.out.println("city Added"+ isCreated);
        
	  }else{
		  System.out.println("Null values are not Created");
	  }
	}else{
			System.out.println(" Size is full");
		}
          return isCreated;
	}
		

      public static void retriveAllCityNames(){
		  
		  for(int city = 0; city< cityNames.length; city++){
			
		    String reference = cityNames[city];
               
              System.out.println("The  " + reference + " City Has Been Added..");		   
		
	  }
}


 public static boolean updateCityName(String existingCityName, String updatedCityName){
	 
	 boolean isUpdted = false;
	 
	 for (int yash = 0; yash < cityNames.length; yash++){
		 
		if(cityNames[yash].equals(existingCityName)){
			 
			        cityNames [yash]   = updatedCityName;
					System.out.println("The  " + updatedCityName + " City Has Been Updated..");
					
			 isUpdted = true;
		}
	 }
	 
	 return isUpdted;
 
 }
}