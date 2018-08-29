/*©2018 Sarah Wilderman
A simple user class for Titan Online Banking*/
package titanOBA;
import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String userName;
    
    /*zero argument*/
    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zipcode = "";
        userName = "";
    }
    /*initialized*/
    public User(String firstName, String lastName, String phone, String address, String city, String state, String zipcode, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.userName = userName;
    }
    
    /*Setters */
    public String getfirstName() {
        return firstName;
    }
    
    public String getlastName() {
        return lastName;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public String getZipcode() {
        return zipcode;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    public void setLasttName (String lastName) {
        this.lastName = lastName;
    }
    
    public void setPhone (String phone) {
        this.phone = phone;
    }
    
    public void setAddress (String address) {
        this.address = address;
    }
    
    public void setCity (String city) {
        this.city = city;
    }
    
    public void setState (String state) {
        this.state = state;
    }
    
    public void setZipcode (String zipcode) {
        this.zipcode = zipcode;
    }
    
    public void setUsertName (String usertName) {
        this.userName = userName;
    }
    
    
}
