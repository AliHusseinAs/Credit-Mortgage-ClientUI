package backendOneUserAndBanker.backendOne.Controller;
// data will be taken form the UI and saved in temp database and evaluated by the bank worker
// it will allow to send all the data in the temp database to the banker for evaluation


import backendOneUserAndBanker.backendOne.ModelLayer.UserTempData;
import backendOneUserAndBanker.backendOne.ServiceLayer.ServiceOneReqInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerOneRequests {
    private final ServiceOneReqInt serviceOneReqInt;

    public ControllerOneRequests(ServiceOneReqInt serviceOneReqInt) {
        this.serviceOneReqInt = serviceOneReqInt;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/v1/backendOneTempDataSet/addTempData")
    public ResponseEntity<String> addTempData(@RequestBody UserTempData userTempData){
        serviceOneReqInt.addTempData(userTempData);
        return new ResponseEntity<>("Data added to temp database", HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/v1/backendOneTempDataSet/removeTempDataByNationalId/{nationalId}")
    public ResponseEntity<String> removeDataFromTemp(@PathVariable Integer nationalId){
       try{
           serviceOneReqInt.removeDataFromTemp(nationalId);
           return new ResponseEntity<>("Data removed from temp database", HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.NOT_FOUND);
       }
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/v1/backendOneTempDataSet/sendDataToBanker")
    public ResponseEntity<List> sendDataToBanker(){
        List<UserTempData> data = serviceOneReqInt.sendDataToBanker();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
