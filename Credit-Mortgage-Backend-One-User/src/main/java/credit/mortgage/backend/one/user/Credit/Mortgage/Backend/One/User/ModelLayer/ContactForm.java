package credit.mortgage.backend.one.user.Credit.Mortgage.Backend.One.User.ModelLayer;
import jakarta.persistence.*;


@Entity
@Table( name = "contact_table")
public class ContactForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( name = "name")
    private String name;
    @Column( name = "surname")
    private String surname;
    @Column( name = "email")
    private String email;
    @Column( name = "topic")
    private String topic;
    @Column( name = "message")
    private String message;

    public ContactForm(){}

    public ContactForm(Long id, String name, String surname, String email, String topic, String message) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.topic = topic;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
