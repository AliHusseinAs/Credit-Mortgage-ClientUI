package credit.mortgage.backend.one.user.ServiceLayer;

import credit.mortgage.backend.one.user.ModelLayer.SaveData;
import credit.mortgage.backend.one.user.ModelLayer.UserTempData;
import credit.mortgage.backend.one.user.RepositoryLayer.RepoReq;
import credit.mortgage.backend.one.user.RepositoryLayer.RepoSaveData;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceImplTwoSaveData implements ServiceTwoSaveData {

    private final RepoSaveData repoSaveData;
    private final RepoReq repoReq;

    public ServiceImplTwoSaveData(RepoSaveData repoSaveData, RepoReq repoReq) {
        this.repoSaveData = repoSaveData;
        this.repoReq = repoReq;
    }

    @Override
    @Transactional
    public void saveDataInBankDatabase(Integer nationalId) {
        UserTempData userTempData = repoReq.findByNationalId(nationalId).orElseThrow(() ->
                new RuntimeException("Data not found with ID: " + nationalId));
        SaveData saveData = new SaveData();
        saveData.setNationalId(userTempData.getNationalId());
        saveData.setCity(userTempData.getCity());
        saveData.setBirthDate(userTempData.getBirthDate());
        saveData.setEmail(userTempData.getEmail());
        saveData.setName(userTempData.getName());
        saveData.setNeighbourhood(userTempData.getNeighbourhood());
        saveData.setLastName(userTempData.getLastName());
        saveData.setPhoneNumber(userTempData.getPhoneNumber());
        saveData.setResidenceCountry(userTempData.getResidenceCountry());
        saveData.setPassword(userTempData.getPassword());
        repoSaveData.save(saveData);
        repoReq.deleteByNationalId(nationalId);

    }

    @Override
    @Transactional
    public void deleteDataFromBankDatabase(Integer nationalId) {
        SaveData saveData = repoSaveData.findByNationalId(nationalId).orElseThrow(() ->
                new RuntimeException("Client with ID: " + nationalId + " is not found in clients database"));
        repoSaveData.deleteByNationalId(nationalId);
    }
}
