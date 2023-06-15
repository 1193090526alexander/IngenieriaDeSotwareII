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
	    Email to = new Email("elmerp1193090526@gmail.com");

	    String subject = "Welcome to CropScan";
	    Content content = new Content("text/plain", "Bienvenido ");

	    Mail mail = new Mail(from, subject, to, content);

	    Request request = new Request();
	    
	    try {
	    	request.setMethod(Method.POST);
		    request.setEndpoint("mail/send");
		    request.setBody(mail.build());

		    Response response = toApi.api(request);

		    System.out.println(response.getStatusCode());
		    System.out.println(response.getHeaders());
		    System.out.println(response.getBody());
	    	
	    }catch(IOException e){
	    	e.printStackTrace();	
	    }
	    
	    	
	}
   
}