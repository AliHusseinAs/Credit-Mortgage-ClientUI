package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ServiceLayer;

import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer.ContactForm;
import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.RepositoryLayer.RepoContactForm;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ServiceThreeContactForm implements ServiceThreeContactFormInt{
    private final RepoContactForm repoContactForm;

    public ServiceThreeContactForm(RepoContactForm repoContactForm) {
        this.repoContactForm = repoContactForm;
    }

    @Override
    @Transactional
    public void saveContactMessageDetails(ContactForm contactForm) {
        repoContactForm.save(contactForm);
    }

    @Override
    @Transactional
    public List<ContactForm> sendContactMessageDetailsToBanker() {
        return repoContactForm.findAll();
    }

    @Override
    @Transactional
    public void deleteContactMessageDetails(String emailId) {
        ContactForm contactForm = repoContactForm.findByEmailId(emailId).orElseThrow(() ->
                new RuntimeException("No contact with email: " + emailId + " exist in the database"));
        repoContactForm.deleteByEmailId(emailId);
    }
}
