package backend.two.investor.Repository;

import backend.two.investor.Model.InvestorRegDataSaved;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SavedRepo extends JpaRepository<InvestorRegDataSaved, Integer> {
    Optional<InvestorRegDataSaved> findByNationalId(Integer nationalId);
    Optional<InvestorRegDataSaved> deleteByNationalId(Integer nationalId);
}
