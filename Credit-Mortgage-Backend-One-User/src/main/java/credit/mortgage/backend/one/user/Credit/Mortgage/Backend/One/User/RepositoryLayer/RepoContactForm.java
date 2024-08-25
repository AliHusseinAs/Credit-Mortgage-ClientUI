package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.RepositoryLayer;

import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoContactForm extends JpaRepository<ContactForm, Long> {
}
