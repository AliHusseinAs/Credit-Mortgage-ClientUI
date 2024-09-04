package credit.mortgage.backend.one.user.RepositoryLayer;

import credit.mortgage.backend.one.user.ModelLayer.SaveData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoSaveData extends JpaRepository<SaveData, Integer> {
    Optional<SaveData> findByNationalId(Integer nationalId);
    Optional<SaveData> deleteByNationalId(Integer nationalId);
}
