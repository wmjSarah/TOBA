/*©2018 Sarah Wilderman
A simple user class for Titan Online Banking*/
package titanOBA;

import java.io.Serializable;
import titanOBA.User;

public class Account implements Serializable {
    private double balance;
    private User user;
    private String acctID;
    
    public Account(double balance, User user) {
        this.balance = balance;
        this.user = user;
        this.acctID = user.getPhone() + user.getZipcode();
    }
    
    public User getUser() {
        return user;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void credit(double credit) {
        this.balance = balance + credit;
    }
    
    public void debit(double debit) {
        this.balance = balance - debit;
    }
    
}

