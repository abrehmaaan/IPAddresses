import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressbyNameAndIP {

	public static void main(String[] args) {
		try {
			InetAddress addressbyname = InetAddress.getByName("www.google.com");
			System.out.println(addressbyname);
			byte[] address = {(byte)142, (byte)250, (byte)201, (byte)132};
			InetAddress addressbyip = InetAddress.getByAddress(address);
			System.out.println(addressbyip);
			InetAddress addressbyipstr = InetAddress.getByName("172.217.18.132");
			System.out.println(addressbyipstr.getHostName());
			
		}catch(UnknownHostException ex) {
			System.out.println("Could not find www.google.com");
		}
	}

}
