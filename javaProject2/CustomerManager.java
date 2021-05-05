package javaProject2;

public class CustomerManager {
	
	private Customer customer;

	public CustomerManager(Customer customer)
	{
		this.customer = customer;
	}

	public void add() {
		System.out.println("Kayýt Eklendi : " + this.customer.getFirstName() + " " + this.customer.getLastName());
	}
	
	public void delete() {
		System.out.println("Kayýt Silindi : " + this.customer.getFirstName() + " " + this.customer.getLastName());
	}
	public void update() {
		System.out.println("Kayýt Güncellendi : " + this.customer.getFirstName() + " " + this.customer.getLastName());
	}
}

