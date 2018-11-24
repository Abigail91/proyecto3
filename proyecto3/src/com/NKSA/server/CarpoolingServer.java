package com.NKSA.server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
@Path("server")
public class CarpoolingServer extends Application {
	

	@GET
	@Path("generar")
	@Produces("application/json")
	
	
	public String suma(@QueryParam("num1") String num1,@QueryParam("num2") String num2){
		 String suma = String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
		 
		  return suma+" Server";
		  
	}

	
}