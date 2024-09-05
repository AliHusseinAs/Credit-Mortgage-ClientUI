package credit.mortgage.backend.one.user.SecurityConfig;

import credit.mortgage.backend.one.user.ModelLayer.UserBankersModel;
import credit.mortgage.backend.one.user.RepositoryLayer.UserBankersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsUserDetailsService implements UserDetailsService {
    private final UserBankersRepo userBankersRepo;

    @Autowired
    public ClientsUserDetailsService(UserBankersRepo userBankersRepo) {
        this.userBankersRepo = userBankersRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String bankerId) throws UsernameNotFoundException {
        UserBankersModel userBankersModel = userBankersRepo.getBankerBybankerId(bankerId).orElseThrow(() ->
                new RuntimeException("No banker found with ID: " + bankerId));
        List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority(userBankersModel.getRole()));
        return new User(userBankersModel.getBankerId(), userBankersModel.getPassword(), authorities);
    }
}
