package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService)
	{
		this.customerCheckService = customerCheckService;
	}
	
	public void Save(Customer customer)
	{
		try
		{
			if (customerCheckService.CheckIfRealPerson(customer))
			{
				super.Save(customer);
			}
		}
		catch (Exception exception)
		{
			System.out.println("hata");
		}
	}
	
}
