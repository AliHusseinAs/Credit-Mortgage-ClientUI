package backendOneUserAndBanker.backendOne.ServiceLayer;


import backendOneUserAndBanker.backendOne.ModelLayer.UserTempData;
import backendOneUserAndBanker.backendOne.RepositoryLayer.RepoReq;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ServiceImplOneReq implements ServiceOneReqInt{

    private final RepoReq repoReq;
    private final PasswordEncoder passwordEncoder;

    public ServiceImplOneReq(PasswordEncoder passwordEncoder, RepoReq repoReq) {
        this.passwordEncoder = passwordEncoder;
        this.repoReq = repoReq;
    }

    @Override
    public void addTempData(UserTempData userTempData) {
        String encodePas = passwordEncoder.encode(userTempData.getPassword());
        userTempData.setPassword(encodePas);
        repoReq.save(userTempData);
    }

    @Override
    public List<UserTempData> sendDataToBanker() {
        return repoReq.findAll();
    }

    @Override
    public void removeDataFromTemp(Integer nationalId) {
        UserTempData userTempData = repoReq.findByNationalId(nationalId).orElseThrow(() ->
                new RuntimeException("No applicant with ID: " + nationalId + " exist in temp database"));
        repoReq.deleteById(nationalId);
    }
}
