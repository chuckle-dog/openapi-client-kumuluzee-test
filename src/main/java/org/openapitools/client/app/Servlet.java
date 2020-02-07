package org.openapitools.client.app;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.openapitools.client.api.PetApi;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class Servlet extends HttpServlet {

    @Inject
    @RestClient
    private PetApi petApi;

    private Logger log = Logger.getLogger(Servlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            log.info("Stuff happened!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}