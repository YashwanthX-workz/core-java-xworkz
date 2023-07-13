
class DominosTester {
	public static void main(String args[]){
		
		double priceOfFood=Dominos.search("Farmhouse Pizza");
		System.out.println(priceOfFood);
		
		 priceOfFood=Dominos.search("Veg Biriyani");
		System.out.println(priceOfFood);
		
		 priceOfFood=Dominos.search("Burger");
		System.out.println("The searched food name is " +priceOfFood);
		
		 priceOfFood=Dominos.search("Chicken Biriyani");
		System.out.println("The searched food name is " +priceOfFood);
		
		 priceOfFood=Dominos.search("Mutton Biriyani");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Jolada Roti");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Goli Baje");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Kundapura Chicken");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Rava Idli ");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Maddur Vada");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Udupi Sambar");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Akki Roti");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Vada Pav");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Neer Dosa");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Mangalore Buns");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Mysore Pak");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Ragi Mudde");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Masala Dosa");
		System.out.println(priceOfFood);
		
		priceOfFood=Dominos.search("Bisi Bele Bath");
		System.out.println(priceOfFood);
		
		System.out.println("With Quantiyt");
		
		
		double priceOfFoodWithQuantity=Dominos.search("Pizza",2);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=Dominos.search("Veg Biriyani",4);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=Dominos.search("Burger",5);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=Dominos.search("Chicken Biriyani",6);
		System.out.println(priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=Dominos.search("Mutton Biriyani",2);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Jolada Roti",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Goli Baje",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Kundapura Chicken",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Rava Idli ",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Maddur Vada",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Udupi Sambar",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Akki Roti",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Vada Pav",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Neer Dosa",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Mangalore Buns",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Ragi Mudde",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Masala Dosa",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Burger",5);
		System.out.println(priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=Dominos.search("Bisi Bele Bath",5);
		System.out.println(priceOfFoodWithQuantity);
		
		
	}
}