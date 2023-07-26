class IndianRupeeTester {

    public static void main(String args[]) {
       
        IndianRupee rupee = new IndianRupee();

        
        rupee.setRupeeId(50);
        rupee.setRupeeName("Indian National Rupee");
        rupee.setPrintDate("2023-07-25");
        rupee.setColor("Green");
        rupee.setSerialNo(123456789l);
        rupee.setNoOfLanguages("15");
        rupee.setSize("63mm x 123mm");
        rupee.setBackSidePlaceName("Hampi");

  
        System.out.println("Rupee ID: " + rupee.getRupeeId());
        System.out.println("Rupee Name: " + rupee.getRupeeName());
        System.out.println("Print Date: " + rupee.getPrintDate());
        System.out.println("Color: " + rupee.getColor());
        System.out.println("Serial Number: " + rupee.getSerialNo());
        System.out.println("Number of Languages: " + IndianRupee.getNoOfLanguages());
        System.out.println("Size: " + rupee.getSize());
        System.out.println("Back Side Place Name: " + rupee.getBackSidePlaceName());
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++");
       
        IndianRupee rupee1 = new IndianRupee();

        rupee1.setRupeeId(100);
        rupee1.setRupeeName("Indian National Rupee");
        rupee1.setPrintDate("2023-07-25");
        rupee1.setColor("light green");
        rupee1.setSerialNo(123456798l);
        rupee1.setNoOfLanguages("15");
        rupee1.setSize("65mm x 130mm");
        rupee1.setBackSidePlaceName("Hampi");

  
        IndianRupee rupee2 = new IndianRupee();

  
        rupee2.setRupeeId(200);
        rupee2.setRupeeName("Indian Heritage Rupee");
        rupee2.setPrintDate("2023-07-26");
        rupee2.setColor("Blue");
        rupee2.setSerialNo(987654321l);
        rupee2.setNoOfLanguages("15");
        rupee2.setSize("65mm x 128mm");
        rupee2.setBackSidePlaceName("Taj Mahal");

     
        System.out.println("Rupee ID: " + rupee1.getRupeeId());
        System.out.println("Rupee Name: " + rupee1.getRupeeName());
        System.out.println("Print Date: " + rupee1.getPrintDate());
        System.out.println("Color: " + rupee1.getColor());
        System.out.println("Serial Number: " + rupee1.getSerialNo());
        System.out.println("Number of Languages: " + IndianRupee.getNoOfLanguages());
        System.out.println("Size: " + rupee1.getSize());
        System.out.println("Back Side Place Name: " + rupee1.getBackSidePlaceName());
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++");

       
        System.out.println("Rupee ID: " + rupee2.getRupeeId());
        System.out.println("Rupee Name: " + rupee2.getRupeeName());
        System.out.println("Print Date: " + rupee2.getPrintDate());
        System.out.println("Color: " + rupee2.getColor());
        System.out.println("Serial Number: " + rupee2.getSerialNo());
        System.out.println("Number of Languages: " + IndianRupee.getNoOfLanguages());
        System.out.println("Size: " + rupee2.getSize());
        System.out.println("Back Side Place Name: " + rupee2.getBackSidePlaceName());
    }
}

    

