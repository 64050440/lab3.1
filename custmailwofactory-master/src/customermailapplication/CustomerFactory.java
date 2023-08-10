/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

/**
 *
 * 
 */
public class CustomerFactory {

private Customer customer;

public void getCustomerTypeFromUser(String customerType) {
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                break;
        }
    }
public void TellCustomerType(int type){
switch(type) {
            case 1:
                getCustomerTypeFromUser("Regular");
                break;
            case 2:
                getCustomerTypeFromUser("Mountain");
                break;
            case 3:
                getCustomerTypeFromUser("Delinquent");
                break;
            
        }
}

public String generateMail() {
        return customer.createMail();
    }
}
