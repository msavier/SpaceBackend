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
 * Root resource (exposed at "webapi" path)
 */
@Path("/create-study-space")
public class CreateStudySpace {
    
    /**
     * Method handling HTTP POST requests.
     *
     * @return Response response to the request made
     */
    @POST
    @Consumes (MediaType.APPLICATION_FORM_URLENCODED)
    public Response createStudySpace(@FormParam("title") String title,
                    @FormParam("images") List<String> images,
					@FormParam("course") String course,
                    @FormParam("location") String location,
					@FormParam("public-description") String publicDescription,
				    @FormParam("group-description") String groupDescription)	{
        
        String responseMessage = "";

        responseMessage += "Title: " + title + "\n";
        responseMessage += "Images: " + images + "\n";
        responseMessage += "Course: " + course + "\n";
        responseMessage += "Location: " + location + "\n";
        responseMessage += "Public Description: " + publicDescription + "\n";
        responseMessage += "Group Description: " + groupDescription + "\n";


        return Response.created(URI.create("/simple-service-webapp/index.jsp")).status(200).entity(responseMessage).build();
        
    }
}
