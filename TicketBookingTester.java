class TicketBookingTester {
	
    public static void main(String[] args) {
      
        TicketBooking ticket = new TicketBooking();

        
        ticket.setBookingId(12345);
        ticket.setNoOfSeats(200);
        ticket.setSource("Chikkaballapur");
        ticket.setDestination("Banglore");
        ticket.setDate("2023-07-25");
        ticket.setTimings("08:00 AM");
        ticket.setPnr("ABC123");
        ticket.setPrice(25.00);
        ticket.setTravelClass("Normal");
        ticket.setBookingType("Online");
        ticket.setTransportName("Basava Express");

     
        System.out.println("Booking ID: " + ticket.getBookingId());
        System.out.println("Number of Seats: " + ticket.getNoOfSeats());
        System.out.println("Source: " + ticket.getSource());
        System.out.println("Destination: " + ticket.getDestination());
        System.out.println("Date: " + ticket.getDate());
        System.out.println("Timings: " + ticket.getTimings());
        System.out.println("PNR: " + ticket.getPnr());
        System.out.println("Price: " + ticket.getPrice());
        System.out.println("Travel Class: " + ticket.getTravelClass());
        System.out.println("Booking Type: " + ticket.getBookingType());
        System.out.println("Transport Name: " + ticket.getTransportName());
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		
		TicketBooking ticket1 = new TicketBooking();

        ticket1.setBookingId(145);
        ticket1.setNoOfSeats(150);
        ticket1.setSource("Mangaluru");
        ticket1.setDestination("Chikkaballapur");
        ticket1.setDate("2023-07-25");
        ticket1.setTimings("10:00 AM");
        ticket1.setPnr("A3");
        ticket1.setPrice(2500.00);
        ticket1.setTravelClass("Sleepaer");
        ticket1.setBookingType("Offline");
        ticket1.setTransportName("Yash Express");

     
        System.out.println("Booking ID: " + ticket1.getBookingId());
        System.out.println("Number of Seats: " + ticket1.getNoOfSeats());
        System.out.println("Source: " + ticket1.getSource());
        System.out.println("Destination: " + ticket1.getDestination());
        System.out.println("Date: " + ticket1.getDate());
        System.out.println("Timings: " + ticket1.getTimings());
        System.out.println("PNR: " + ticket1.getPnr());
        System.out.println("Price: " + ticket1.getPrice());
        System.out.println("Travel Class: " + ticket1.getTravelClass());
        System.out.println("Booking Type: " + ticket1.getBookingType());
        System.out.println("Transport Name: " + ticket1.getTransportName());
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		TicketBooking ticket2 = new TicketBooking();

        
        ticket2.setBookingId(345);
        ticket2.setNoOfSeats(300);
        ticket2.setSource("Banglore");
        ticket2.setDestination("Delhi");
        ticket2.setDate("2023-07-25");
        ticket2.setTimings("09:00 AM");
        ticket2.setPnr("S3");
        ticket2.setPrice(5500.00);
        ticket2.setTravelClass("AC Coch");
        ticket2.setBookingType("Online");
        ticket2.setTransportName("Banglore Express");

     
        System.out.println("Booking ID: " + ticket2.getBookingId());
        System.out.println("Number of Seats: " + ticket2.getNoOfSeats());
        System.out.println("Source: " + ticket2.getSource());
        System.out.println("Destination: " + ticket2.getDestination());
        System.out.println("Date: " + ticket2.getDate());
        System.out.println("Timings: " + ticket2.getTimings());
        System.out.println("PNR: " + ticket2.getPnr());
        System.out.println("Price: " + ticket2.getPrice());
        System.out.println("Travel Class: " + ticket2.getTravelClass());
        System.out.println("Booking Type: " + ticket2.getBookingType());
        System.out.println("Transport Name: " + ticket2.getTransportName());
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
    }
}
