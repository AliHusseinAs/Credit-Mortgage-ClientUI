package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.RepositoryLayer;

import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer.SaveData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoSaveData extends JpaRepository<SaveData, Integer> {
    Optional<SaveData> findByNationalId(Integer nationalId);
}
