package credit.mortgage.backend.one.user.Controller;


import credit.mortgage.backend.one.user.ModelLayer.ContactForm;
import credit.mortgage.backend.one.user.ServiceLayer.ServiceThreeContactFormInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ControllerContactForm {

    private final ServiceThreeContactFormInt serviceThreeContactFormInt;

    public ControllerContactForm(ServiceThreeContactFormInt serviceThreeContactFormInt) {
        this.serviceThreeContactFormInt = serviceThreeContactFormInt;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/v1/backEndOneMortgage/saveContactMessageDetails")
    public ResponseEntity<String> saveContactMessageDetails(@RequestBody ContactForm contactForm){
        serviceThreeContactFormInt.saveContactMessageDetails(contactForm);
        return new ResponseEntity<>("Contact informations are added", HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("v1/backEndOneMortgage/sendContactMessageDetailsToBanker")
    public ResponseEntity<List> sendContactMessageDetailsToBanker(){
        List<ContactForm> data = serviceThreeContactFormInt.sendContactMessageDetailsToBanker();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("v1/backEndOneMortgage/deleteContactMessageDetails/{emailId}")
    public ResponseEntity<String> deleteContactMessageDetails(@PathVariable String emailId){
        try{
            serviceThreeContactFormInt.deleteContactMessageDetails(emailId);
            return new ResponseEntity<>("Message detailed are deleted, message was responded", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
