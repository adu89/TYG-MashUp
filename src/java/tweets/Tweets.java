/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweets;

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
@Path("tweets")
public class Tweets {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Tweets
     */
    public Tweets() {
    }
    
    @GET
    @Path("search/{query}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getXml(@PathParam("query") String query, @QueryParam("since") String since, @QueryParam("until") String until, @QueryParam("maxTweets") String maxTweets) {
        //TODO return proper representation object
        TwitterCriteria criteria = null;             
        criteria = TwitterCriteria.create();
        criteria.setQuerySearch(query);
        if(since != null)
            criteria.setSince(since);
        if(until != null)
            criteria.setUntil(until);
        if(maxTweets != null)
            criteria.setMaxTweets(Integer.valueOf(maxTweets));
        else {
            criteria.setMaxTweets(50);
        }
        String s = "{\"tweets\":[";
        for(Tweet t : TweetManager.getTweets(criteria)){
            s = s + "{\"text\":\"" + t.getText() + "\"," + " \"date\":\"" + t.getDate() + "\"},";
        }
        s = s  + "]}";                 
        return s;
    }
}
