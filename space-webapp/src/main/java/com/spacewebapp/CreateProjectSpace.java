package com.spacewebapp;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/create-project-space")
public class CreateProjectSpace {
    
    /**
     * Method handling HTTP POST requests.
     *
     * @return Response response to the request made
     */
    @POST
    @Consumes (MediaType.APPLICATION_FORM_URLENCODED)
    public Response createProjectSpace(@FormParam("title") String title,
		   			@FormParam("field") String field,
                    @FormParam("images") List<String> images,
					@FormParam("location") String location,
					@FormParam("public-description") String publicDescription,
				       @FormParam("group-description") String groupDescription)	{
    
	String responseMessage = "";

    	responseMessage += "Title: " + title + "\n";
	responseMessage += "Field: " + field + "\n";
    responseMessage += "Images: " + images + "\n";
	responseMessage += "Location: " + location + "\n";
	responseMessage += "Public Description: " + publicDescription + "\n";
	responseMessage += "Group Description: " + groupDescription + "\n";


	return Response.created(URI.create("/simple-service-webapp/index.jsp")).status(200).entity(responseMessage).build();
    
    }
}
