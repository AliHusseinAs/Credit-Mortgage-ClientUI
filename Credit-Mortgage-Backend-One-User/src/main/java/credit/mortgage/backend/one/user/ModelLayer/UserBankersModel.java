package credit.mortgage.backend.one.user.ModelLayer;
// this model and its related classes and interfaces are for bank workers who will deal with all kinds of interactions
// with the clients { not investors } and their account open and loan requests
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "bankers_for_clients")
public class UserBankersModel {
    @Id
    @Column(name = "banker_Id")
    private String bankerId;
    @Column(name="nationalId")
    private Integer nationalId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "password")
    private String password;
    @Column(name = "birthdate")
    private LocalDate birthdate;
    @Column(name = "role")
    private String role; // always will be banker;

    public UserBankersModel() {}

    public UserBankersModel(String role, String bankerId, Integer nationalId, String name, String surname, String email, String phoneNumber, String password, LocalDate birthdate) {
        this.bankerId = bankerId;
        this.nationalId = nationalId;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.birthdate = birthdate;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBankerId() {
        return bankerId;
    }

    public void setBankerId(String bankerId) {
        this.bankerId = bankerId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
