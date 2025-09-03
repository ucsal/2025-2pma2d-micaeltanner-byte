import br.com.mariojp.solid.dip.MailSender;
import br.com.mariojp.solid.dip.User;

public class EmailNotifier {

    private final MailSender mailSender;

    public EmailNotifier(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void welcome(User user) {
        mailSender.send(user.getEmail(), "Bem-vindo!", "Olá, " + user.getName() + "! Bem-vindo ao nosso sistema.");
    }
}