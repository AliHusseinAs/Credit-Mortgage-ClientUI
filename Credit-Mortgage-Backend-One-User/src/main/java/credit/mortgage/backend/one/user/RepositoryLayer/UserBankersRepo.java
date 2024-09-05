package credit.mortgage.backend.one.user.RepositoryLayer;

import credit.mortgage.backend.one.user.ModelLayer.UserBankersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserBankersRepo extends JpaRepository<UserBankersModel, String> {
    Optional<UserBankersModel> getBankerBybankerId(String bankerId);
    Optional<UserBankersModel> deleteBankerBybankerId(String bankerId);
}
