package backendOneUserAndBanker.backendOne.RepositoryLayer;


import backendOneUserAndBanker.backendOne.ModelLayer.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoContactForm extends JpaRepository<ContactForm, String> {
    Optional<ContactForm> deleteByEmailId(String emailId);
    Optional<ContactForm> findByEmailId(String emailId);
}
