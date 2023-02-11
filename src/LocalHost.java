import java.net.*;
public class LocalHost{
	public static void main (String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
		} catch (UnknownHostException ex) {
			System.out.println("Could not find localhost");
		}
	}
}