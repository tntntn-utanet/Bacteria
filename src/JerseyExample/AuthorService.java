//original source from 
//https://examples.javacodegeeks.com/enterprise-java/rest/java-json-restful-web-service-example/
package JerseyExample;


import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import Bacteria.BacteriaResponse;

@Path("/authors")
//@Path("/AuthorService")
	public class AuthorService {
	@GET
	@Produces("application/json")
        
	public List<Person> getBacteriaJSON() {
                List<Person> listPerson = new ArrayList<>();
		Person p1 = new Person();
                
		p1.setId((new BacteriaResponse()).getBacteriaResponse());
		p1.setName("Bacteria1");
		listPerson.add(p1);
		return listPerson;
	}
//public List<Person> getTrackInJSON() {
//                List<Person> listPerson = new ArrayList<>();
//		Person p1 = new Person();
//		p1.setId(1);
//		p1.setName("name1");
//		Person p2 = new Person();
//		p2.setId(2);
//		p2.setName("name2");
//		listPerson.add(p1);
//		listPerson.add(p2);
//		return listPerson;
//	}
}
