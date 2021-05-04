import java.util.List;

public interface CustomerService {
		void add(Customer customer);
		void update(Customer customer);
		void delete(Customer customer);
		List<Customer> getAll();
		
}
