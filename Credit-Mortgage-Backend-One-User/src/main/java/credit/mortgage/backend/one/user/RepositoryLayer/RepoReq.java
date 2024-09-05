package credit.mortgage.backend.one.user.RepositoryLayer;

import credit.mortgage.backend.one.user.ModelLayer.UserTempData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoReq extends JpaRepository<UserTempData, Integer> {
    Optional<UserTempData> findByNationalId(Integer nationalId);
    Optional<UserTempData> deleteByNationalId(Integer nationalId);
}
