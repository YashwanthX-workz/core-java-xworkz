class UberEats{


    public static double search(String foodName){
		double priceOfFood = 0.0;
		
		if("Spicy Tuna Roll" == foodName){
			System.out.println("Search food name is " +foodName);
			 priceOfFood =989.00 ;
			return priceOfFood;
			}
		if("Mozzarella Sticks " == foodName){
			System.out.println("Search food name is " +foodName);
			 priceOfFood =679.00 ;
			return priceOfFood;
			}
		if("Chicken Tikka Masala " == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 1070.00;
			return priceOfFood;
		}
		if("California Roll" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 980.00;
			return priceOfFood;
		}
		if("Miso Soup" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 989.00;
			return priceOfFood;
		}
		if("Soda" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 899.00;
			return priceOfFood;
		}
		if("Garlic Naan" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 799.00;
			return priceOfFood;
		}
		if("Pad Thai" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 699.00;
			return priceOfFood;
		}
		if("kabab" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 889.00;
			return priceOfFood;
		}
		if("Fry" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 999.00;
            return priceOfFood;
		}
		
		if("Leg Pc" == foodName){
			System.out.println("Search food name is " +foodName);
			 priceOfFood =989.00 ;
			return priceOfFood;
			}
		if("Peri Peri " == foodName){
			System.out.println("Search food name is " +foodName);
			 priceOfFood =679.00 ;
			return priceOfFood;
			}
		if("Classic Chicken Roll " == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 1070.00;
			return priceOfFood;
		}
		if("Buckwheat" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 980.00;
			return priceOfFood;
		}
		if("Biryani Combo" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 989.00;
			return priceOfFood;
		}
		if("Smoky Grilled Biryani " == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 899.00;
			return priceOfFood;
		}
		if("Popcorn Biryani" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 799.00;
			return priceOfFood;
		}
		if("Family Feast" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 699.00;
			return priceOfFood;
		}
		if("Krispers Combo" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 889.00;
			return priceOfFood;
		}
		if("Tandoori Zinger Burger" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 999.00;
            return priceOfFood;
		}
	return priceOfFood;
	
	
}

public static int search(String foodName,int quantity){
		if(foodName=="Yumburger"){
			return 129*quantity;
		}
		if(foodName=="Chickenjoy"){
			return 299*quantity;
		}
		if(foodName=="Spaghetti"){
			return 299*quantity;
		}
		if(foodName=="Farmhouse Pizza"){
			return 479*quantity;
		}
		if(foodName=="Non Veg Loaded"){
			return 169*quantity;
		}
		if(foodName=="margherita Pizza"){
			return 259*quantity;
		}
		if(foodName=="Samosa"){
			return 50*quantity;
		}
		if(foodName=="Sandwich"){
			return 100*quantity;
		}
		if(foodName=="Momos"){
			return 150*quantity;
		}
		if(foodName=="Chicken Biriyani"){
			return 200*quantity;
		}
		if(foodName=="Mutton Biriyani"){
			return 300*quantity;
		}
		if(foodName=="Chilly Chicken"){
			return 250*quantity;
		}
		if(foodName=="Chicken 65"){
			return 245*quantity;
		}
		if(foodName=="Chicken Lollypop"){
			return 250*quantity;
		}
		if(foodName=="Parota"){
			return 300*quantity;
		}
		if(foodName=="Thandoori"){
			return 234*quantity;
		}
		if(foodName=="Chapathi"){
			return 243*quantity;
		}
		if(foodName=="Curd Rice"){
			return 242*quantity;
		}
		if(foodName=="Tomato Rice"){
			return 323*quantity;
		}
		if(foodName=="Khaju Masala"){
			return 432*quantity;
		}
		if(foodName=="Panneer Masala"){
			return 234*quantity;
		}
		if(foodName=="Mashroom masala"){
			return 545*quantity;
		}
		if(foodName=="Egg rice"){
			return 343*quantity;
		}
		if(foodName=="Omlette"){
			return 234*quantity;
		}
		if(foodName=="Prons"){
			return 543*quantity;
		}
		if(foodName=="Gobi"){
			return 234*quantity;
		}
		return 0;
	}
}

