package javaProject2;

public class CustomerManager {
	
	private Customer customer;

	public CustomerManager(Customer customer)
	{
		this.customer = customer;
	}

	public void add() {
		System.out.println("Kay�t Eklendi : " + this.customer.getFirstName() + " " + this.customer.getLastName());
	}
	
	public void delete() {
		System.out.println("Kay�t Silindi : " + this.customer.getFirstName() + " " + this.customer.getLastName());
	}
	public void update() {
		System.out.println("Kay�t G�ncellendi : " + this.customer.getFirstName() + " " + this.customer.getLastName());
	}
}

