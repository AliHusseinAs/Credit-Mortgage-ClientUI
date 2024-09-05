package backendOneUserAndBanker.backendOne.ServiceLayer;


import backendOneUserAndBanker.backendOne.ModelLayer.UserBankersModel;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBankerInterface {
    void addBankers(UserBankersModel userBankersModel);
    void deleteBankers(String bankerId);
}
