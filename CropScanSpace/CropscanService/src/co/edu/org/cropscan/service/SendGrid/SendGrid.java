package co.edu.org.cropscan.service.SendGrid;

import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import co.edu.org.cropscan.crosscutting.exception.CropscanCropscanException;
import co.edu.org.cropscan.service.port.MailPort;

@Component
public class SendGrid implements MailPort {

    @Value("${spring.sendgrid.api-key}")
    private String key;
    @Value("${email}")
    private String senderMail;

    @Override
    public void sendMail(String message, String user, String title) {
        Email sender = new Email(senderMail);
        Email receiver = new Email(user);
        Content content = new Content("text/plain", message);
        Mail mail = new Mail(sender, title, receiver, content);
        SendGrid sendGrid = new SendGrid();
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sendGrid.api(request);
        } catch (CropscanCropscanException exception) {
            throw exception;
        } catch (Exception exception) {
            throw CropscanCropscanException.createTechnicalException("An unexpected error occurred while trying to send the email",exception);
        }
    }

	}

}