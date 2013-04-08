import com.pcm.service.PayroleService;


public class PersonFactory {
	
	private static PersonFactory instance;

	public static PersonFactory getInstance() {
		if(instance==null){
			instance = new PersonFactory();
		}
		return instance;
		
		
	}
}
