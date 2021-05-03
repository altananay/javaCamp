package Abstract;

import Entities.Customer;


public class BaseCustomerManager implements CustomerCheckService {
	
	
	public boolean CheckIfRealPerson(Customer customer) throws Exception
	{
		throw new Exception();
	}
	
	public void Save(Customer customer)
	{
		System.out.println("Saved to database: " + customer.getFirstName());
	}
	
}
