package javaDay4Homework2;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("ALTAN");
		customer.setLastName("ANAY");
		customer.setNationalityId("00000000000");
		customer.setDateOfBirth(new GregorianCalendar(1111, 7,25).getTime());
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.Save(customer);

	}

}
