/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotator.tuke.urbansensing.org;

import annotator.tuke.urbansensing.org.POJO.DBPediaResult;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:AnnotatorWrapper
 * [/helloworld]<br>
 * USAGE:
 * <pre>
        DBPediaSpotlightClient client = new DBPediaSpotlightClient();
        Object response = client.XXX(...);
        // do whatever with response
        client.close();
 </pre>
 *
 * @author rodinka
 */
public class DBPediaSpotlightClient {
    private WebTarget webTarget;
    private Client client;
   

    public DBPediaSpotlightClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        
    }

    public DBPediaResult wrapAnnotation(String text,String url, 
            Double confidence, Integer support, String types, String sparql, 
            String policy, Boolean conferenceResolution, String spotter, String disambiguator, String annotatorURL) throws ClientErrorException {
        if(spotter==null || spotter.equals("")) spotter=null;
        if(disambiguator==null || disambiguator.equals("")) disambiguator=null;
        if(text==null || text.equals("")) text=null;
        if(url==null || url.equals("")) url=null;
        if(types==null || types.equals("")) types=null;
        if(sparql==null || sparql.equals("")) sparql=null;
        if(policy==null || policy.equals("")) policy=null;
        webTarget = client.target(annotatorURL).queryParam("text", text)
                .queryParam("url", url)
                .queryParam("confidence", confidence)
                .queryParam("support", support)
                .queryParam("types", types)
                .queryParam("sparql", sparql)
                .queryParam("policy", policy)
                .queryParam("conferenceResolution", conferenceResolution)
                .queryParam("spotter", spotter)
                .queryParam("disambiguator", disambiguator);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(DBPediaResult.class);
    }


    public void close() {
        client.close();
    }
    
}
