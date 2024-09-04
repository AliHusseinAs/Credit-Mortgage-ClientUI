package credit.mortgage.backend.one.user.ModelLayer;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class SaveData {
    @Id
    @Column(name = "nationalId")
    private Integer nationalId;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "country_of_residence")
    private String residenceCountry;
    @Column(name = "city")
    private String city;
    @Column(name = "neighbourhood")
    private String neighbourhood;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "brith_date")
    private LocalDate birthDate;
    @Column(name = "email")
    private String email;

    public SaveData() {}

    public SaveData(Integer nationalId, String name, String password, String lastName, String residenceCountry, String city, String neighbourhood, String phoneNumber, LocalDate birthDate, String email) {
        this.nationalId = nationalId;
        this.name = name;
        this.password = password;
        this.lastName = lastName;
        this.residenceCountry = residenceCountry;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry = residenceCountry;
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