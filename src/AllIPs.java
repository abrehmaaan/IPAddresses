import java.net.*;
public class AllIPs{
	public static void main (String[] args) {
		try {

			InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
			for (InetAddress address : addresses) {
				System.out.println(address);
			}
		} catch (UnknownHostException ex) {
			System.out.println("Could not find www.google.com");
		}
	}
}