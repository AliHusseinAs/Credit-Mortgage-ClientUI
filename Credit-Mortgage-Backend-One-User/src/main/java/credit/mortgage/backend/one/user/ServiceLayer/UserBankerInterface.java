package credit.mortgage.backend.one.user.ServiceLayer;

import credit.mortgage.backend.one.user.ModelLayer.UserBankersModel;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBankerInterface {
    void addBankers(UserBankersModel userBankersModel);
    void deleteBankers(String bankerId);
}
