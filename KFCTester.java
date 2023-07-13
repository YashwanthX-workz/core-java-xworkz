class KFCTester {
	public static void main(String args[]){
		double priceOfFood=KFC.search("Leg Pc");
		System.out.println(priceOfFood);
		
		 priceOfFood=KFC.search("Peri Peri ");
		System.out.println(priceOfFood);
		
		 priceOfFood=KFC.search("Burger");
		System.out.println(priceOfFood);
		
		 priceOfFood=KFC.search("Classic Chicken Roll ");
		System.out.println(priceOfFood);
		
		 priceOfFood=KFC.search("Smoky Grilled Biryani");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Popcorn Biryani");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Family Feast");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Burger");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Tandoori Zinger Burger");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Krispers Combo");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Family Feast");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Popcorn Biryani");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Smoky Grilled Biryani ");
		System.out.println(priceOfFood);
		
		
	priceOfFood=KFC.search("Biryani Combo");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Buckwheat");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Classic Chicken Roll ");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Burger");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Buckwheat");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Family Feast");
		System.out.println(priceOfFood);
		
		priceOfFood=KFC.search("Burger");
		System.out.println("priceOfFood\n");
		
		
		System.out.println("The Food with Quntity\n");
		
		double priceOfFoodWithQuantity=KFC.search("Peri Peri Chicken",2);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=KFC.search("Chicken Strips",4);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=KFC.search("Classic Chicken Roll",8);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=KFC.search("Farmhouse Pizza",34);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=KFC.search("Non Veg Loaded",100);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("margherita Pizza",9);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Samosa",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Sandwich",3);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Momos",8);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Chicken Biriyani",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Mutton Biriyani",2);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Chilly Chicken",3);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Chicken 65",6);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Chicken Lollypop",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Burger",2);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Parota",7);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Thandoori",6);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Chapathi",4);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Curd Rice",3);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Tomato Rice",5);
		System.out.println(priceOfFoodWithQuantity);
	}
}