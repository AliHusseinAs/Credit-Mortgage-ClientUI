package backendOneUserAndBanker.backendOne.RepositoryLayer;


import backendOneUserAndBanker.backendOne.ModelLayer.SaveData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoSaveData extends JpaRepository<SaveData, Integer> {
    Optional<SaveData> findByNationalId(Integer nationalId);
    Optional<SaveData> deleteByNationalId(Integer nationalId);
}
