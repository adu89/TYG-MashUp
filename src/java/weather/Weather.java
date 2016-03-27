/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * REST Web Service
 *
 * @author Andrew
 */
@Path("weather")
public class Weather {

    @Context
    private UriInfo context;
    private final String apiKey = "&key=b9ced62a4f8c47d798615518162703";
    private final String weather = "http://api.apixu.com/v1/forecast.json";
    private static final HttpClient defaultHttpClient = HttpClients.createDefault();

    /**
     * Creates a new instance of Weather
     */
    public Weather() {
    }

    /**
     * Retrieves representation of an instance of weather.Weather
     * @return an instance of java.lang.String
     */
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCurrentWeather(@QueryParam("lat") String lat, @QueryParam("lon") String lon, @QueryParam("days") String days) throws IOException {
        HttpGet httpGet = new HttpGet(weather + "?q=" + lat + "," + lon + "&days=" + days + apiKey);
	HttpEntity resp = defaultHttpClient.execute(httpGet).getEntity();	
	return EntityUtils.toString(resp);
    }
}
