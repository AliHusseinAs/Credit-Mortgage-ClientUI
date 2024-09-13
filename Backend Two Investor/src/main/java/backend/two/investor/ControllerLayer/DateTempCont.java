package backend.two.investor.ControllerLayer;


import backend.two.investor.Model.InvestorRegDataTemp;
import backend.two.investor.ServiceLayer.ServiceTempData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DateTempCont {

    private final ServiceTempData serviceTempData;

    public DateTempCont(ServiceTempData serviceTempData) {
        this.serviceTempData = serviceTempData;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/InvestorBackend/v1/sendDataToTempDatabase")
    public ResponseEntity<String> getAllData(@RequestBody  InvestorRegDataTemp investorRegDataTemp){
        try{
            serviceTempData.getAllData(investorRegDataTemp);
            return new ResponseEntity<>("Data sent", HttpStatus.CREATED);

        } catch (Exception e){
            return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/InvestorBackend/v1/sendDataToBanker")
    public ResponseEntity<List> sendTempData(){
        List<InvestorRegDataTemp> data = serviceTempData.sendTempData();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/InvestorBackend/v1/deleteTempInvestor/{nationalId}")
    public ResponseEntity<String> removeDataFromTemp(@PathVariable Integer nationalId){
        try{
            serviceTempData.removeDataFromTemp(nationalId);
            return new ResponseEntity<>("Investor with ID: " + nationalId + "has been deleted", HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>("Investor not found in temp database" + e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

}
