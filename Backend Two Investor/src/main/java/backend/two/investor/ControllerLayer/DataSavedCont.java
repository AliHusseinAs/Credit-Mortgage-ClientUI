package backend.two.investor.ControllerLayer;

import backend.two.investor.Model.InvestorRegDataSaved;
import backend.two.investor.ServiceLayer.ServiceSavedData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataSavedCont {
    private final ServiceSavedData serviceSavedData;

    public DataSavedCont(ServiceSavedData serviceSavedData) {
        this.serviceSavedData = serviceSavedData;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/InvestorBackend/v1/saveDataBankDatabase/{nationalId}")
    public ResponseEntity<String> saveDataInBankDatabase(@PathVariable Integer nationalId){
        try{
            serviceSavedData.saveDataInBankDatabase(nationalId);
            return new ResponseEntity<>("Investor with ID: " + nationalId + "is saved to database", HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>("An error occurred in adding investor data" + e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/InvestorBackend/v1/deleteInvestorFromBankDatabase/{nationalId}")
    public ResponseEntity<String> deleteDataFromBankDatabase(@PathVariable Integer nationalId){
        try{
            serviceSavedData.deleteDataFromBankDatabase(nationalId);
            return new ResponseEntity<>("Investor with ID: " + nationalId + "has been deleted", HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>("Invsetor with ID: " + nationalId + "is not found" + e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
