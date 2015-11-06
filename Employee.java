
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

		UUID id;
		String message;
		String name;
		public void setId(UUID id){
			this.id = id;
		}
		
		public UUID getId(){
			return id;
		}
		public void setName(String name)
		{
			this.name = name;
			
		}
		public String getName(){
			return name;
			}
		public void setMessage(String message){
			this.message = message;
		}
		
		public String getMessage(){
			return message;
		}
}
