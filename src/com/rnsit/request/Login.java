package com.rnsit.request;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/login")
public class Login {

	@POST
	  @Produces(MediaType.TEXT_HTML)
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public String newTodo(@FormParam("userId") String userId,
	      @FormParam("password") String password) throws IOException {
		//if user id and password will match then return token
		System.out.println("User Id : "+userId+" Password : "+password);
		
	    return "token";
	  }
}
