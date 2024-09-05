package credit.mortgage.backend.one.user.SecurityConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class config {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.requestMatchers("/v1/backendOneTempDataSet/removeTempDataByNationalId/{nationalId}"
        , "/v1/backendOneTempDataSet/sendDataToBanker", "/v1/backEndOneMortgage/saveDataInBankDatabase/{nationalId}",
                "/v1/backEndOneMortgage/deleteDataFromBankDatabase/{nationalId}","v1/backEndOneMortgage/deleteContactMessageDetails/{emailId}").authenticated().
                requestMatchers("/v1/backEndOneMortgage/saveContactMessageDetails",
                        "v1/backEndOneMortgage/sendContactMessageDetailsToBanker",
                        "/v1/backendOneTempDataSet/addTempData","/v1/backEndOne/addNewBankersData").permitAll());
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        http.csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
