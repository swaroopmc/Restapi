
import java.io.*;
import java.util.ArrayList;
import java.util.UUID;


import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/init")
public class Service {
	public static int id= 0;
	public static ArrayList<Employee> list=new ArrayList<>();
	

	
	  @GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Employee> getCustomerInXML() {
			return list;
			
		}
	  
	  
	 
	  
	  
	  
	  
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getCustomerInXML(@PathParam("id") UUID id) {
		for(Employee value1:list){
			if(id.equals(value1.getId())){
				return value1;
			}
		}
		return null;
		
	}
  
	 @POST
	  @Consumes(MediaType.APPLICATION_JSON)
	  public Response create(Employee my) throws IOException {
		  
		  Employee value1 = new Employee();
		  value1.setId(UUID.randomUUID());
		  value1.setName(my.getName());
		  value1.setMessage(my.getMessage());
		  
		  list.add(value1);
		  
	      return Response.ok().entity(value1).build();

	  }
	 
	 
	 
}
