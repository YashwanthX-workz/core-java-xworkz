class Dominos{


    public static double search(String foodName){
		double priceOfFood = 0.0;
		
		if("Farmhouse Pizza" == foodName){
			System.out.println("Search food name is " +foodName);
			 priceOfFood =119.00 ;
			return priceOfFood;
			}
		if("Veg Biriyani" == foodName){
			System.out.println("Search food name is " +foodName);
			 priceOfFood =109.00 ;
			return priceOfFood;
			}
		if("Burger" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 100.00;
			return priceOfFood;
		}
		if("Chicken Biriyani" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 100.00;
			return priceOfFood;
		}
		if("Mutton Biriyani" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 99.00;
			return priceOfFood;
		}
		if("Jolada Roti" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 89.00;
			return priceOfFood;
		}
		if("Goli Baje" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 79.00;
			return priceOfFood;
		}
		if("Kefir" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 69.00;
			return priceOfFood;
		}
		if("Kundapura Chicken" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 59.00;
			return priceOfFood;
		}
		if("Rava Idli " == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 49.00;
            return priceOfFood;
		}
		if("Maddur Vada" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 49.00;
            return priceOfFood;
		}
        if("Udupi Sambar" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 49.00;
            return priceOfFood;
		}
        if("Akki Roti" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 49.00;
            return priceOfFood;
		}
        if("Vada Pav" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 49.00;
            return priceOfFood;
		}
        if("Mangalore Buns" == foodName){
			System.out.println("Search food name is "+foodName);
			priceOfFood = 49.00;
            return priceOfFood;
		}		
	return priceOfFood;
	
	
}

public static int search(String foodName,int quantity){
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
		if(foodName=="Jolada Roti"){
			return 250*quantity;
		}
		if(foodName=="Goli Baje"){
			return 300*quantity;
		}
		if(foodName=="Kundapura Chicken"){
			return 234*quantity;
		}
		if(foodName=="Rava Idli "){
			return 243*quantity;
		}
		if(foodName=="Maddur Vada"){
			return 242*quantity;
		}
		if(foodName=="Udupi Sambar"){
			return 323*quantity;
		}
		if(foodName=="Akki Roti"){
			return 432*quantity;
		}
		if(foodName=="Vada Pav"){
			return 234*quantity;
		}
		if(foodName=="Neer Dosa"){
			return 545*quantity;
		}
		if(foodName=="Mangalore Buns"){
			return 343*quantity;
		}
		if(foodName=="Ragi Mudde"){
			return 234*quantity;
		}
		if(foodName=="Masala Dosa"){
			return 543*quantity;
		}
		if(foodName=="Bisi Bele Bath"){
			return 234*quantity;
		}
		return 0;
	}
}


