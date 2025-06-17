package org.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*            SELECT,  UPDATE,   DELETE,    INSERT
 * 
 * RECURSOS:   @GET,    @PUT,    @DELETE,    @POST
 * 
 *   VERBOS:   @GET,    @PUT,    @DELETE,    @POST
 * 
 * ENDPOINT:   @GET,    @PUT,    @DELETE,    @POST
 * 
 * CONTRATOS 
 * DE 
 * INTERFAZ:   @GET,    @PUT,    @DELETE,    @POST
 * 
 */

@Path("/servicio")
public class ApiRestMimes {

	//ENDPOINT, GET: http://localhost:7575/APIRestMimes/servicio/formatxml
		
	@GET
	@Path("/formatxml")
	@Produces(MediaType.APPLICATION_XML)
	public String responseInFormatXML() {
		String response = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<Empleado>"
				+ "<id>100</id>"
				+ "<nombre>JUAN CARLOS</nombre>"
				+ "<salario>25000.0</salario>"
				+ "</Empleado>";
		return  response;
	}
	
	
	//ENDPOINT, GET: http://localhost:7575/APIRestMimes/servicio/formathtml
	
		@GET
		@Path("/formathtml")
		@Produces(MediaType.TEXT_HTML)
		public String responseInFormatHTML() {
			String response = "<html>"
					+ "<head><title>REST API</title></head>"
					+ "<body>"
					+ "<h1>ID:100</h1>"
					+ "<h2>NOMBRE:JUAN CARLOS</h2>"
					+ "<h3>SALARIO: 25000.0</h3>"
					+ "</body>"
					+ "</html>";
			return  response;
		}
	

		//ENDPOINT, GET: http://localhost:7575/APIRestMimes/servicio/formatjson

		@GET
		@Path("/formatjson")
		@Produces(MediaType.APPLICATION_JSON)
		public String responseInFormatJSON() {
			String response = "{"
					+ "'id':100,"
					+ "'nombre':'JUAN CARLOS',"
					+ "'salario':25000.0"
					+ "}";
			return  response;
		}
		
		
		
	
}







