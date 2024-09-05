package backendOneUserAndBanker.backendOne.ServiceLayer;

public interface ServiceTwoSaveData {
    void saveDataInBankDatabase(Integer nationalId);
    void deleteDataFromBankDatabase(Integer nationalId);
}
