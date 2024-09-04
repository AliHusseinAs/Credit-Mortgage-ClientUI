package credit.mortgage.backend.one.user.Controller;
// here once the banker agrees on account open { or not } this controller will send
// requests to the temp database and save it in the main database of the bank { client database }
// or upon refusal by the banker, the data will be deleted

import credit.mortgage.backend.one.user.ServiceLayer.ServiceTwoSaveData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerTwoSaveData {
    private final ServiceTwoSaveData serviceTwoSaveData;

    public ControllerTwoSaveData(ServiceTwoSaveData serviceTwoSaveData) {
        this.serviceTwoSaveData = serviceTwoSaveData;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/v1/backEndOneMortgage/saveDataInBankDatabase/{nationalId}")
    public ResponseEntity<String> saveDataInBankDatabase(@PathVariable Integer nationalId){
        try{
            serviceTwoSaveData.saveDataInBankDatabase(nationalId);
            return new ResponseEntity<>("Client with ID: " + nationalId + " is saved in client database and deleted from" +
                    "temp database"
                    , HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/v1/backEndOneMortgage/deleteDataFromBankDatabase/{nationalId}")
    public ResponseEntity<String> deleteDataFromBankDatabase(@PathVariable Integer nationalId){
        try{
            serviceTwoSaveData.deleteDataFromBankDatabase(nationalId);
            return new ResponseEntity<>("Client with ID: " + nationalId + " is deleted from client database",
                    HttpStatus.OK);

        } catch(Exception e){
            return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
