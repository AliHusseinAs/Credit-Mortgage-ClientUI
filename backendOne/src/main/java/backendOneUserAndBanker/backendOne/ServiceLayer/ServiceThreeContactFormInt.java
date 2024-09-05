package backendOneUserAndBanker.backendOne.ServiceLayer;



import backendOneUserAndBanker.backendOne.ModelLayer.ContactForm;

import java.util.List;

public interface ServiceThreeContactFormInt {
    void saveContactMessageDetails(ContactForm contactForm);
    List<ContactForm> sendContactMessageDetailsToBanker();
    void deleteContactMessageDetails(String emailId);
}
