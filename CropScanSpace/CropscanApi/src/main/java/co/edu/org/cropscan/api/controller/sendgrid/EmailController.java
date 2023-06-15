package co.edu.org.cropscan.api.controller.sendgrid;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.*;

import java.io.IOException;

public class EmailController {

   public static void main(String[] args) throws IOException {

       Email from = new Email("elmerp1193090526@gmail.com");
       Email to = new Email("juanjose01212@gmail.com");

       String subject = "Sending with Twilio SendGrid is Fun";
       Content content = new Content("text/html", "and <em>easy</em> to do anywhere with <strong>Java</strong>");

       Mail mail = new Mail(from, subject, to, content);

       SendGrid sg = new SendGrid(System.getenv("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"));
       Request request = new Request();

       request.setMethod(Method.POST);
       request.setEndpoint("mail/send");
       request.setBody(mail.build());

       Response response = sg.api(request);

       System.out.println(response.getStatusCode());
       System.out.println(response.getHeaders());
       System.out.println(response.getBody());
   }
}