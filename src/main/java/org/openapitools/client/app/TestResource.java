package org.openapitools.client.app;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.openapitools.client.api.TestApi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@RequestScoped
@Path("test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResource {

    @Inject
    @RestClient
    private TestApi testApi;

    private Logger log = Logger.getLogger(TestResource.class.getName());

    @GET
    public Response doGet(){
        log.info("Stuff happened on API.");

        return Response.status(Response.Status.OK).build();
    }
}