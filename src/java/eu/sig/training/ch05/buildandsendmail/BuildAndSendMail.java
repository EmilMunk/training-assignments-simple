package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, PersonInformation person,
        Mail mail) {
        // Format the email address
        String mId = person.firstName.charAt(0) + "." + person.lastName.substring(0, 7) + "@"
            + mail.division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(mail.font,
            mail.message1 + mail.message2 + mail.message3);
        // Send message
        m.send(mId, mail.subject, mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(String font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }


    private class MailMessage {

    }

}