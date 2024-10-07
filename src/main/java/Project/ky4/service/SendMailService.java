package Project.ky4.service;

import Project.ky4.dto.MailInfo;
import jakarta.mail.MessagingException;
import java.io.IOException;


public interface SendMailService {
    void run();

    void queue(String to, String subject, String body);

    void queue(MailInfo mail);

    void send(MailInfo mail) throws MessagingException, IOException;
}
