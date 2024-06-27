import java.util.*;

public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Bookings : ");
		int a = sc.nextInt();
		Ticket ticket = new Ticket();
		System.out.println("Enter Available Tickets : ");
		int b = sc.nextInt();
		Ticket.setAvailableTickets(b);
		do {

			System.out.println("Enter Ticket Id : ");
			int c = sc.nextInt();
			System.out.println("Enter Price : ");
			int d = sc.nextInt();
			System.out.println("Enter No. Of Tickets : ");
			int e = sc.nextInt();

			ticket.setPrice(d);
			ticket.setTicketid(c);
			

			System.out.println("Available tickets : " + Ticket.getAvailableTickets());
			int calculateTicketCost = ticket.calculateTicketCost(e);
			System.out.println("Total Amount : " + calculateTicketCost);
			System.out.println("Available tickets after booking : " + Ticket.getAvailableTickets());
			a--;
			// System.out.println("booking no ");
		} while (a >= 1);

	}

}
