package backendOneUserAndBanker.backendOne.RepositoryLayer;


import backendOneUserAndBanker.backendOne.ModelLayer.UserTempData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoReq extends JpaRepository<UserTempData, Integer> {
    Optional<UserTempData> findByNationalId(Integer nationalId);
    Optional<UserTempData> deleteByNationalId(Integer nationalId);
}
