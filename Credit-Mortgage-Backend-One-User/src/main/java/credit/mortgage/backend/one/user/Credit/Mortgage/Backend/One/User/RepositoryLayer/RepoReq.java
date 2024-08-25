package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.RepositoryLayer;

import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer.UserTempData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoReq extends JpaRepository<UserTempData, Integer> {
}
