package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class SaveData {
    @Id
    @Column( name = "nationalId")
    private Integer nationalId;
    @Column( name = "name")
    private String name;
    @Column( name = "last_name")
    private String lastName;
    @Column( name = "country_of_residence")
    private String ResidenceCountry;
    @Column( name = "city")
    private String city;
    @Column( name = "neighbourhood")
    private String neighbourhood;
    @Column( name = "phone_number")
    private String phoneNumber;
    @Column( name = "brith_date")
    private LocalDate birthDate;
    @Column( name = "email")
    private String email;

    public SaveData() {}

    public SaveData(Integer nationalId, String name, String lastName, String residenceCountry, String city, String neighbourhood, String phoneNumber, LocalDate birthDate, String email) {
        this.nationalId = nationalId;
        this.name = name;
        this.lastName = lastName;
        ResidenceCountry = residenceCountry;
        this.city = city;
        this.neighbourhood = neighbourhood;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Integer getNationalId() {
        return nationalId;
    }

    public void setNationalId(Integer nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResidenceCountry() {
        return ResidenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        ResidenceCountry = residenceCountry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
