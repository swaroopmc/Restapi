

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Postmethod {
	static final String endPointName = "6d26bbc3-a66a-455e-b089-3bb2f8ac915e";

	public static void main(String[] args) {

		try {

			Client Employee1 = Client.create();
			
			
			WebResource webResource1 = Employee1
					.resource("http://localhost:8080/restapp/rest/init");
			
			

			
			
			String message1 = "{\"name\":\"paul1\",\"message\":\"Hi! I am reporting \"} ";
			


			

			ClientResponse response1 = webResource1.type("application/json")
					.post(ClientResponse.class, message1);
			


			if (response1.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response1.getStatus());
			}
			

			System.out.println("Information is posted to the server \nServer details are as follows : .... \n");
			String output1 = response1.getEntity(String.class);
			
			
			System.out.println(output1);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
