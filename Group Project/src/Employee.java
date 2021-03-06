import java.util.ArrayList;

/**
 * Employee class that's used as a parent class to clerk and manager where shard methods are declared here
 * @version 4/25/20
 * @author Blake Wesel
 *         Hansel Leal
 *         Bryce Jones
 *         Regina Bass
 *         Samual Crouch
 */

public class Employee extends Person {

    public Employee() {
        super();
    }

    public Employee(int id, String name, String home_address, String mobile_phone, String home_phone, String email_address, String password) {
        super(id, name, home_address, mobile_phone, home_phone, email_address, password);
    }

   /**
    * Gets info about an item from a given store
    *
    * @param store: A store
    * @param item: An item to be queried from said store
    * @return: The queried item
    */
    public Item getItemInfo(Store store, Item item) {
        if(store.getInventoryList().contains(item)) {
            return store.getInventoryList().get(store.getInventoryList().indexOf(item));
        } else {
            return null;
        }
    }
   
   /**
    * Creates a customer from a set of parameters
    */
    public Customer createCustomer(int id, String name, String home_address, String mobile_phone, String home_phone, String email_address,
                                   String creditCardInfo, String password) {
        //TODO
        return new Customer(id, name, home_address, mobile_phone, home_phone, email_address, creditCardInfo, password);
    }
    
   /**
    * Modifies an existing customer's information
    */
    public void modifyCustomer(Customer cust, String name, String addr, String phone, String email, CreditCard ccInfo) {
        cust.setName(name);
        cust.setHome_address(addr);
        cust.setMobile_phone(phone);
        cust.setEmail_address(email);
        cust.setCreditCardNumber(ccInfo.getCardNumber());
        cust.setCreditCardExp(ccInfo.getExpiration());
    }
    
   /**
    * Retrieves a list of fines from a passed customer
    *
    * @param cust: A Customer
    * @return: An ArrayList of Charges associated with cust
    */
    public ArrayList<Charge> getCustomerFines(Customer cust) {
        return cust.getFinesOwed();
    }
}
