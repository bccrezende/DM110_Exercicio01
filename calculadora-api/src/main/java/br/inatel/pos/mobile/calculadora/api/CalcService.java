package br.inatel.pos.mobile.calculadora.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalcService {
		
	@POST
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result buildMessage(@FormParam("first") int first, @FormParam("second") int second);
	
	@POST
	@Path("/sub")
	@Produces(MediaType.APPLICATION_JSON)
	Result buildMessage1(@FormParam("first") int first, @FormParam("second") int second);
}

