package co.edu.org.cropscan.api.controller.sendgrid;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.*;

import java.io.IOException;

public class EmailController {
	
	private final SendGrid toApi;
	
	public EmailController(){
		this.toApi = new SendGrid("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");
	}
	
	public void sendMail (){
		
		Email from = new Email("elmerp1193090526@gmail.com");
	    Email to = new Email("juan.cardona4185@uco.net.co");

	    String subject = "Welcome to CropScan";
	    Content content = new Content("text/plain", "Bienvenido ");

	    Mail mail = new Mail(from, subject, to, content);

	    SendGrid sg = new SendGrid(System.getenv("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"));
	    Request request = new Request();
	    
	    try {
	    	request.setMethod(Method.POST);
		    request.setEndpoint("mail/send");
		    request.setBody(mail.build());

		    Response response = sg.api(request);

		    System.out.println(response.getStatusCode());
		    System.out.println(response.getHeaders());
		    System.out.println(response.getBody());
	    	
	    }catch(IOException e){
	    	
	    }
	    
	    	
	}
   
}