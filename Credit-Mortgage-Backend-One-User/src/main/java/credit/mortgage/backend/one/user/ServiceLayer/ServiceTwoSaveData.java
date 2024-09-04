package credit.mortgage.backend.one.user.ServiceLayer;

public interface ServiceTwoSaveData {
    void saveDataInBankDatabase(Integer nationalId);
    void deleteDataFromBankDatabase(Integer nationalId);
}
