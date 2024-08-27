package credit.mortgage.backend.one.user.ServiceLayer;

import credit.mortgage.backend.one.user.ModelLayer.ContactForm;

import java.util.List;

public interface ServiceThreeContactFormInt {
    void saveContactMessageDetails(ContactForm contactForm);
    List<ContactForm> sendContactMessageDetailsToBanker();
    void deleteContactMessageDetails(String emailId);
}
