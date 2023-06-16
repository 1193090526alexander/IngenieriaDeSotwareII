package co.edu.org.cropscan.service.port;

public interface MailPort {
	
	void sendMail(String message, String user, String title);

}
