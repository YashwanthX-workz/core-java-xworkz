class Barbeque{


    public static double search(String foodName){
		double priceOfFood = 0.0;
		
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

public static double search(String foodName,int quantity){
		if(foodName=="Peri Peri Chicken"){
			System.out.println(foodName);
			return 499.05*quantity;
		}
		if(foodName=="Chicken Strips"){
			System.out.println(foodName);
			return 299.05*quantity;
		}
		if(foodName=="Classic Chicken Roll"){
			System.out.println(foodName);
			return 176.19*quantity;
		}
		if(foodName=="Farmhouse Pizza"){
			return 479.0*quantity;
		}
		if(foodName=="Non Veg Loaded"){
			return 169.9*quantity;
		}
		if(foodName=="margherita Pizza"){
			return 259.2*quantity;
		}
		if(foodName=="Samosa"){
			return 50.34*quantity;
		}
		if(foodName=="Sandwich"){
			return 100.4*quantity;
		}
		if(foodName=="Momos"){
			return 150.3*quantity;
		}
		if(foodName=="Chicken Biriyani"){
			return 200.3*quantity;
		}
		if(foodName=="Mutton Biriyani"){
			return 300.2*quantity;
		}
		if(foodName=="Chilly Chicken"){
			return 250.2*quantity;
		}
		if(foodName=="Chicken 65"){
			return 245.2*quantity;
		}
		if(foodName=="Chicken Lollypop"){
			return 250.2*quantity;
		}
		if(foodName=="Parota"){
			return 300.9*quantity;
		}
		if(foodName=="Thandoori"){
			return 234.2*quantity;
		}
		if(foodName=="Chapathi"){
			return 243.2*quantity;
		}
		if(foodName=="Curd Rice"){
			return 242.2*quantity;
		}
		if(foodName=="Tomato Rice"){
			return 323.0*quantity;
		}
		if(foodName=="Khaju Masala"){
			return 432.0*quantity;
		}
		if(foodName=="Panneer Masala"){
			return 234.7*quantity;
		}
		if(foodName=="Mashroom masala"){
			return 545.3*quantity;
		}
		if(foodName=="Egg rice"){
			return 343.32*quantity;
		}
		if(foodName=="Omlette"){
			return 234.2*quantity;
		}
		if(foodName=="Prons"){
			return 543.2*quantity;
		}
		if(foodName=="Gobi"){
			return 234.7*quantity;
		}
		return 0;
	}
}

