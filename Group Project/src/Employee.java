/*
    SWEN 383 - Final Group Project
    Team Name: Machine Code Migos
    Team Members: Blake Wesel, Bryce Jones, Regina Bass, Hansel Leal, Samuel Crouch
    Date Due: April 17
*/

public class Employee {
    //No class attributes - only methods

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
    public Customer createCustomer(String name, String addr, int phone, String email, CreditCard ccInfo) {
        //TODO
        return null;
    }
    
   /**
    * Modifies an existing customer's information
    */
    public void modifyCustomer(Customer cust, String name, String addr, int phone, String email, CreditCard ccInfo) {
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
