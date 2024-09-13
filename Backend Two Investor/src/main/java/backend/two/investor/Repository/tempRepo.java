package backend.two.investor.Repository;

import backend.two.investor.Model.InvestorRegDataTemp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TempRepo extends JpaRepository<InvestorRegDataTemp, Integer> {
    Optional<InvestorRegDataTemp> findByNationalId(Integer nationalId);
    Optional<InvestorRegDataTemp> deleteByNationalId(Integer nationalId);
}
