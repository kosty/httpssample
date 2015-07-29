package org.httpssample;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class EntryPoint {
	
	@GET
	@Path("entry")
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> getEntry(){
		
		Map<String, String> a = new HashMap<String, String>();
		a.put("id", "1");
		a.put("name", "entry");
		return a;
	}
	
}