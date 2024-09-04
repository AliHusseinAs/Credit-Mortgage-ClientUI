package backend.two.investor.ServiceLayer;

public interface serviceSavedData {
    void saveDataInBankDatabase(Integer nationalId);
    void deleteDataFromBankDatabase(Integer nationalId);
}
