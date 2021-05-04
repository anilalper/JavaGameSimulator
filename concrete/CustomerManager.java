
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomerManager implements CustomerService{

	private UserValidatorService userValidatorService;
	private List<Customer> customers;
	public CustomerManager(UserValidatorService userValidatorService) {
		super();
		this.userValidatorService = userValidatorService;
		this.customers=new ArrayList<Customer>(); 
	}

	@Override
	public void add(Customer customer) {
		if (userValidatorService.isValid(customer)) {
		 this.customers.add(customer);
			System.out.println("Kullanici Sisteme Eklendi Kullanici Adı :"+customer.getFirstName());
		
		}
		else {
			System.out.println("Kullanıcı Doğrulanamadı");
		}
		
	}

	@Override
	public void update(Customer customer) {
		if (customers.stream().anyMatch(c->c.getId()==customer.getId()))
		{
			if (userValidatorService.isValid(customer)) {
			Stream<Customer> cust=customers.stream().filter(c->c.getId()==customer.getId());
		    Customer result=cust.findFirst().get();
		    int index=customers.indexOf(result);
		    System.out.println(index);
		    customers.set(index, customer);
			}
			else 
			{
				System.out.println("Değiştirlmek istenen kullanıcı bilgileri doğrulanamadı");
			}
		}
		else {
			System.out.println("Değiştirilecek Kullancıcı Bulunamadı");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		if (customers.stream().anyMatch(c->c.getId()==customer.getId()))
		{
			customers.remove(customer);
			System.out.println("Kullanıcı Silindi. Kullanıcı: "+customer.getFirstName());
		}
		else {
			System.out.println("Çıkarılacak Kullancıcı Bulunamadı");
		}
		
	}

	@Override
	public List<Customer> getAll() {
		return customers;
	}

}
