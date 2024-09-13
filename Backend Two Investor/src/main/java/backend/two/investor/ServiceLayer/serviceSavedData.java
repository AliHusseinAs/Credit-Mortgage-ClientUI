package backend.two.investor.ServiceLayer;

public interface ServiceSavedData {
    void saveDataInBankDatabase(Integer nationalId);
    void deleteDataFromBankDatabase(Integer nationalId);
}
