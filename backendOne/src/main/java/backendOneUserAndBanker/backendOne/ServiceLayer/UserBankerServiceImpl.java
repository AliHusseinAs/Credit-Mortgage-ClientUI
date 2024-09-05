package backendOneUserAndBanker.backendOne.ServiceLayer;


import backendOneUserAndBanker.backendOne.ModelLayer.UserBankersModel;
import backendOneUserAndBanker.backendOne.RepositoryLayer.UserBankersRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserBankerServiceImpl implements UserBankerInterface{

    private final UserBankersRepo userBankersRepo;
    private final PasswordEncoder passwordEncoder;

    public UserBankerServiceImpl(UserBankersRepo userBankersRepo, PasswordEncoder passwordEncoder) {
        this.userBankersRepo = userBankersRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void addBankers(UserBankersModel userBankersModel) {
        String encodePas = passwordEncoder.encode(userBankersModel.getPassword());
        userBankersModel.setPassword(encodePas);
        userBankersRepo.save(userBankersModel);
    }

    @Override
    public void deleteBankers(String bankerId) {
        userBankersRepo.getBankerBybankerId(bankerId).orElseThrow(() ->
                new RuntimeException("No banker with ID: " + bankerId));
        userBankersRepo.deleteBankerBybankerId(bankerId);
    }
}
