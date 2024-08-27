package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ServiceLayer;

public interface ServiceTwoSaveData {
    void saveDataInBankDatabase(Integer nationalId);
    void deleteDataFromBankDatabase(Integer nationalId);
}
