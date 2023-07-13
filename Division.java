class Division{
	public static void main(String args[]){
		int total =  div(344,344);
		int total2 =  div(344,78);
		int total3 =  div(344,76);
		int total5 =  div(8,4,2);
		int total6 = div(200,100,50);
		System.out.println(total);
		System.out.println(total2);
		System.out.println(total3);
		System.out.println(total5);
		System.out.println(total6);
	}
	public static int div(int z, int u){
		return (z/u);
	
	
	}
	public static int div(int z, int u, int y){
		return(z/u/y);
	}
}