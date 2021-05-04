
public class UserValidatorManager implements UserValidatorService{

	@Override
	public boolean isValid(Customer customer) {
		/*Mernis uygulandı githuba atılacağı için silindi*/
		if (customer.getLastName()=="Avdan") {
			return true;
		}
		return false;
	}

}
