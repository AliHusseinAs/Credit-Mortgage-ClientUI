package backend.two.investor.ServiceLayer;

import backend.two.investor.Model.InvestorRegDataTemp;
import backend.two.investor.Repository.TempRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ServiceTempDataImpl implements ServiceTempData {

    private final TempRepo tempRepo;
    private final PasswordEncoder passwordEncoder;

    public ServiceTempDataImpl(TempRepo tempRepo, PasswordEncoder passwordEncoder) {
        this.tempRepo = tempRepo;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    // Adds data
    public void getAllData(InvestorRegDataTemp investorRegDataTemp) {
        String encodeRes = passwordEncoder.encode(investorRegDataTemp.getPassword());
        investorRegDataTemp.setPassword(encodeRes);
        tempRepo.save(investorRegDataTemp);
    }

    @Override
    public List<InvestorRegDataTemp> sendTempData() {
        return tempRepo.findAll();
    }

    @Override
    public void removeDataFromTemp(Integer nationalId) {
        InvestorRegDataTemp investorRegDataTemp = tempRepo.findByNationalId(nationalId).orElseThrow(() ->
                    new RuntimeException("No investor with ID: " + nationalId + "is in the database"));
        tempRepo.deleteByNationalId(nationalId);
    }
}
