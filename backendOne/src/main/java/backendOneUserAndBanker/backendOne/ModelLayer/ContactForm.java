package backendOneUserAndBanker.backendOne.ModelLayer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table( name = "contact_table")
public class ContactForm {
    @Id
    @Column(name = "email")
    private String emailId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "topic")
    private String topic;
    @Column(name = "message")
    private String message;

    public ContactForm() {
    }

    public ContactForm(String emailId, String name, String surname, String topic, String message) {
        this.emailId = emailId;
        this.name = name;
        this.surname = surname;
        this.topic = topic;
        this.message = message;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}