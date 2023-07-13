class Flowers{
	

	static int index;
	static String allFlowers[] = {null,null,null,null,null,null,null};
	
	public static boolean createFlower(String flower){
		
		boolean isCreated = false;
		
		if(allFlowers.length > index){
		
		if(flower != null){
			
			allFlowers[index] = flower;
			index ++;
			
		}else{
		System.out.println("Cannot add chai, as it as null value");
		
		}
		}else{
			System.out.println("Array size is full");
		}
		return isCreated;
		}
	
		
			
	
	
	
	public static void getAllFlowers(){
		
		for(int flower = 0; flower< allFlowers.length; flower++){
			
			String reference = allFlowers[flower];
			
			System.out.println("The  " + reference + "  Flower Has Been Created");
		}
	}
	
	
	
	public static boolean updateFlowereName(String existingFlowerName, String updatedFlowereName){
		
		boolean isUpdated = false;
		
		for(int y = 0; y< allFlowers.length; y++){
			
			
			if(allFlowers[y].equals(existingFlowerName)){
				
				allFlowers[y] = updatedFlowereName;
				
				isUpdated = true;
				
				System.out.println("The Updated Flower Name is" +updatedFlowereName);
			}
			
			
			
		}
		
		return isUpdated;
	}
		
}

	
	
