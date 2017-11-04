package br.inatel.dm110.calculadora.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.inatel.dm110.calculadora.model.Result;

@Path("/calc")
public interface CalculadoraService {

	@GET
	@Path("sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum(@QueryParam("first") int first, @QueryParam("last") int last);
	
	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Result message(@FormParam("first") int first, @FormParam("last") int last);
	
	
}
