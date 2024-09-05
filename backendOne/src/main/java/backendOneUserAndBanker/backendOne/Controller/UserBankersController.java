package backendOneUserAndBanker.backendOne.Controller;


import backendOneUserAndBanker.backendOne.ModelLayer.UserBankersModel;
import backendOneUserAndBanker.backendOne.ServiceLayer.UserBankerInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserBankersController {

    private final UserBankerInterface userBankerInterface;

    public UserBankersController(UserBankerInterface userBankerInterface) {
        this.userBankerInterface = userBankerInterface;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/v1/backEndOne/addNewBankersData")
    public ResponseEntity<String> addBankers(@RequestBody UserBankersModel userBankersModel){
        userBankerInterface.addBankers(userBankersModel);
        return new ResponseEntity<>("Bankers data is added", HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/v1/backEndOne/deleteBankerData/{bankerId}")
    public ResponseEntity<String> deleteBankers(@PathVariable String bankerId){
        try{
            userBankerInterface.deleteBankers(bankerId);
            return new ResponseEntity<>("Banker with ID: " + bankerId + "has been deleted", HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>("Error occurred: " + e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
