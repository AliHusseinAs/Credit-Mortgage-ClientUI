package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.RepositoryLayer;

import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer.UserTempData;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface RepoReq extends JpaRepository<UserTempData, Integer> {
    Optional<UserTempData> findByNationalId(Integer nationalId);
    Optional<UserTempData> deleteByNationalId(Integer nationalId);
}
