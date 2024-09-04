package backend.two.investor.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "temp_investor_data")
public class InvestorRegDataTemp {
    @Id
    @Column(name = "national_id")
    private Integer nationalId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "password")
    private String password;
    @Column(name = "country_of_residence")
    private String countryOfResidence;
    @Column(name = "city")
    private String city;
    @Column(name = "Neighborhood")
    private String neighborhood;
    @Column(name = "total_assets")
    private Integer totalAssets;
    @Column(name = "total_cash_in_account")
    private Integer totalCashInAccount;
    @Column(name = "date_of_birth")
    private LocalDate birthDate;
    @Column(name = "tax_number")
    private String taxNumber;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;

    public InvestorRegDataTemp() {}

    public InvestorRegDataTemp(Integer nationalId, String name, String surname, String password, String countryOfResidence, String city, String neighborhood, Integer totalAssets, Integer totalCashInAccount, LocalDate birthDate, String taxNumber, String phoneNumber, String email) {
        this.nationalId = nationalId;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.countryOfResidence = countryOfResidence;
        this.city = city;
        this.neighborhood = neighborhood;
        this.totalAssets = totalAssets;
        this.totalCashInAccount = totalCashInAccount;
        this.birthDate = birthDate;
        this.taxNumber = taxNumber;
        this.phoneNumber = phoneNumber;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Integer totalAssets) {
        this.totalAssets = totalAssets;
    }

    public Integer getTotalCashInAccount() {
        return totalCashInAccount;
    }

    public void setTotalCashInAccount(Integer totalCashInAccount) {
        this.totalCashInAccount = totalCashInAccount;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
