package org.openapitools.client.api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.openapitools.client.model.Pet;

import javax.enterprise.context.Dependent;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@RegisterRestClient
@Dependent
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface TestApi {

    @GET
    @Path("/pet/{petId}")
    @Produces({ "application/xml", "application/json" })
    public Pet getPetById(@PathParam("petId") Long petId) throws ApiException, ProcessingException;
}
