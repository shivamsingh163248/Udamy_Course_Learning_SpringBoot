package JPA.Learning.Hibernet.TableCreating;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    // creating all the properties of the table
    @Id
    private int id;
    private String name;
    private String city;

    // creating the getter and setter methods for the ALL properties
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
