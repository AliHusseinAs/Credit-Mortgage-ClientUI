package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ServiceLayer;

import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer.UserTempData;
import credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.RepositoryLayer.RepoReq;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ServiceImplOneReq implements ServiceOneReqInt{

    private RepoReq repoReq;

    public ServiceImplOneReq(RepoReq repoReq) {
        this.repoReq = repoReq;
    }

    @Override
    public void addTempData(UserTempData userTempData) {
        repoReq.save(userTempData);
    }

    @Override
    public List<UserTempData> sendDataToBanker() {
        return repoReq.findAll();
    }

    @Override
    public void removeDataFromTemp(Integer nationalId) {
        repoReq.deleteById(nationalId);
    }
}
