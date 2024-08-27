package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ServiceLayer;

import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer.ContactForm;

import java.util.List;

public interface ServiceThreeContactFormInt {
    void saveContactMessageDetails(ContactForm contactForm);
    List<ContactForm> sendContactMessageDetailsToBanker();
    void deleteContactMessageDetails(String emailId);
}
