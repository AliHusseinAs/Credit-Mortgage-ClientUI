package backend.two.investor.ServiceLayer;

import backend.two.investor.Model.InvestorRegDataSaved;
import backend.two.investor.Model.InvestorRegDataTemp;
import backend.two.investor.Repository.SavedRepo;
import backend.two.investor.Repository.TempRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceSavedDataImpl implements ServiceSavedData {

    private final SavedRepo savedRepo;
    private final TempRepo tempRepo;

    public ServiceSavedDataImpl(SavedRepo savedRepo, TempRepo tempRepo) {
        this.savedRepo = savedRepo;
        this.tempRepo = tempRepo;
    }

    @Override
    @Transactional
    public void saveDataInBankDatabase(Integer nationalId) {
        InvestorRegDataTemp investorRegDataTemp = tempRepo.findByNationalId(nationalId).orElseThrow(() ->
                    new RuntimeException("No investor found"));
        InvestorRegDataSaved investorRegDataSaved = new InvestorRegDataSaved();
        investorRegDataSaved.setNeighborhood(investorRegDataTemp.getNeighborhood());
        investorRegDataSaved.setBirthDate(investorRegDataTemp.getBirthDate());
        investorRegDataSaved.setTotalCashInAccount(investorRegDataTemp.getTotalCashInAccount());
        investorRegDataSaved.setCity(investorRegDataTemp.getCity());
        investorRegDataSaved.setCountryOfResidence(investorRegDataTemp.getCountryOfResidence());
        investorRegDataSaved.setEmail(investorRegDataTemp.getEmail());
        investorRegDataSaved.setName(investorRegDataTemp.getName());
        investorRegDataSaved.setNationalId(investorRegDataTemp.getNationalId());
        investorRegDataSaved.setPassword(investorRegDataTemp.getPassword());
        investorRegDataSaved.setPhoneNumber(investorRegDataTemp.getPhoneNumber());
        investorRegDataSaved.setSurname(investorRegDataTemp.getSurname());
        investorRegDataSaved.setTaxNumber(investorRegDataTemp.getTaxNumber());
        investorRegDataSaved.setTotalAssets(investorRegDataTemp.getTotalAssets());
        savedRepo.save(investorRegDataSaved);
        tempRepo.deleteByNationalId(nationalId);
    }


    // deletes investor data from bank's main database
    @Override
    public void deleteDataFromBankDatabase(Integer nationalId) {
        InvestorRegDataSaved investorRegDataSaved = savedRepo.findByNationalId(nationalId).orElseThrow(()->
                new RuntimeException("No investor with nationalID: " + nationalId));
        savedRepo.deleteByNationalId(nationalId);

    }
}
