package credit.mortgage.backend.one.user.RepositoryLayer;

import credit.mortgage.backend.one.user.ModelLayer.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoContactForm extends JpaRepository<ContactForm, String> {
    Optional<ContactForm> deleteByEmailId(String emailId);
    Optional<ContactForm> findByEmailId(String emailId);
}
