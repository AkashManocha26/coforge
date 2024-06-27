
public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	
	public int calculateTicketCost(int nooftickets) {
		
		if(availableTickets>0) {
			availableTickets=availableTickets-nooftickets;
			return nooftickets*price;
		}
		else {
			return -1;
		}
	}
	
	
	
	public int getTicketid() {
		return ticketid;
	}
	public int getPrice() {
		return price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
			Ticket.availableTickets = availableTickets;
		}
		else {
			System.out.println("Invalid value for availableTickets");
			System.exit(0);
		}
		
	}
	
	
	
}
