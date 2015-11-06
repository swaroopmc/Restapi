
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Getmethod {

	public static void main(String[] args) {
		try {

			Client httpclient1 = Client.create();
			Client httpclient2 = Client.create();
			

			WebResource webResource = httpclient1
					.resource("http://localhost:8080/restapp/rest/init");
			WebResource webResource1 = httpclient2
					.resource("http://localhost:8080/restapp/rest/init/");

			ClientResponse response1 = webResource.accept("application/json")
					.get(ClientResponse.class);
			ClientResponse response2 = webResource1.accept("application/json")
					.get(ClientResponse.class);

			if (response1.getStatus() != 200) {
				throw new RuntimeException("Failed to execute: HTTP error  : "
						+ response1.getStatus());
			}
			
			if (response2.getStatus() != 200) {
				throw new RuntimeException("Failed to execute: HTTP error : "
						+ response2.getStatus());
			}

			String output = response1.getEntity(String.class);
			String output1 = response2.getEntity(String.class);

			System.out.println("Server Output .... \n\n");
			System.out.println("Get results"+output+"   \nGetby id "+output1);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
