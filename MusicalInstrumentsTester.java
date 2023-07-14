class MusicalInstrumentsTester{
	
      public static void main(String music[]){
		  
		  
		  MusicalInstruments instrument = new MusicalInstruments();

          instrument.brandName = "Yash";
          instrument.color = "brown";
          instrument.price = 500;
          instrument.type = "guitar";
          instrument.toPlay();
		  System.out.println("The BrandName is "+instrument.brandName);
		  System.out.println("The instrument color is"+instrument.color);
		  System.out.println("The instrument Type  is "+instrument.type);
		  System.out.println("the instrument prce is  "+instrument.price);
		                                              
		  MusicalInstruments instrument1 = new MusicalInstruments();
		  instrument1.brandName = "Sarigamapa";
          instrument1.color = "Black";
          instrument1.price = 4000;
          instrument1.type = "Piano";
          instrument1.toPlay();
		  System.out.println("The First Copy");
		  System.out.println("The BrandName is "+instrument1.brandName);
		  System.out.println("The instrument color is"+instrument1.color);
		  System.out.println("The instrument Type  is "+instrument1.type);
		  System.out.println("the instrument prce is  "+instrument1.price);
		  
		  MusicalInstruments instrument2 = new MusicalInstruments();
		  instrument2.brandName = "Yash";
          instrument2.color = "Blue";
          instrument2.price = 25000;
          instrument2.type = "Violin";
          instrument2.toPlay();
		  System.out.println("The Second Copy");
		  System.out.println("The BrandName is "+instrument2.brandName);
		  System.out.println("The instrument color is"+instrument2.color);
		  System.out.println("The instrument Type  is "+instrument2.type);
		  System.out.println("the instrument prce is  "+instrument2.price);
		  
		  
		  MusicalInstruments instrument3 = new MusicalInstruments();
		  instrument3.brandName = "Yash";
          instrument3.color = "Red";
          instrument3.price = 5670;
          instrument3.type = "Flute";
          instrument3.toPlay();   
		  System.out.println("The Third Copy");
		  System.out.println("The BrandName is "+instrument3.brandName);
		  System.out.println("The instrument color is"+instrument3.color);
		  System.out.println("The instrument Type  is "+instrument3.type);
		  System.out.println("the instrument prce is  "+instrument3.price);
		  
		  
	  }





}