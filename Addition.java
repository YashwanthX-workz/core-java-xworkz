class Addition{
	public static void main(String args[]){
		int sum =add(344,433);
		int sum2 =add(344,433);
		int sum3 =add(344,343);
		int sum4 =add(344,433);
		int sum5 =add(3,433);
		int sum7=add(1,23,53);
		int sum8=add(14,23,3);
		int sum9=add(1,23,3);
		int sum10=add(1,2,983);
		
	
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
			System.out.println("With 3 parameter overloading");
		
		System.out.println(sum7);
		System.out.println(sum8);
		System.out.println(sum9);
		System.out.println(sum10);
		
		
	}
	public static int add(int z, int u){
		return (z+u);
	
	//method Overloading
	}
	public static int add(int z, int u, int y){
		return(z+u+y);
	
}
}


