/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurants;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 */
@Path("restaurants")
public class Restaurant {

    @Context
    private UriInfo context;
    

    /**
     * Creates a new instance of Restaurant
     */
    public Restaurant() {
    }

    /**
     * 
     * Returns json array of list of restaurants
     * 
     */
    @Path("search/{query}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String searchByQuery(@PathParam("query") String query, 
                                @QueryParam("location") String location,
                                @QueryParam("limit") String limit,
                                @QueryParam("offset") String offset,
                                @QueryParam("sort") String sort,
                                @QueryParam("radius") String radius) {
        //TODO return proper representation object
        return YelpAPI.yelpSearchByString(query, location, limit, offset, sort, radius);
    }
    
     /**
     * 
     * Returns json object for restaurant id
     * 
     */
    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String searchByQuery(@PathParam("id") String id) {
        //TODO return proper representation object
        return YelpAPI.yelpSearchByID(id);
    }

}
