/**
 *  Defines an Address type.
 */

package lib;

/**
 * @author Lara
 */

public class Address {
    private String civicNumber;
    private String streetName;
    	
    public Address() { } //no param constrcutor

    public Address (String civicNumber, String streetName)    {
    	this.civicNumber = civicNumber;
    	this.streetName = streetName;
    }//constrctor end
    
    public String getAddress()  {
    	return civicNumber + " " + streetName;
    }

    public String getCivicNumber()  {
    	return civicNumber;
    }
    
    public String getStreetName()    {
    	return streetName;
    }
}
