class Girias {
	public static void main(String devices[]){
		System.out.println("Main Started\n");
		String electronicDevices[]={"Refrigeretor","Washing Machine","Television","LED","Grinder","AC","Iron Box","Microwave\n"};
		double priceOfElectronicDevices[]={10000.0,20000.0,30000.0,40000.0,50000.0,60000.0,70000.0,80000.0};
		for(String electronicDevice:electronicDevices){
			System.out.println(electronicDevice);
		}
		for(double priceOfElectronicDevice:priceOfElectronicDevices){
			System.out.println(priceOfElectronicDevice);
		}
		System.out.println("Main Ended");
	}
