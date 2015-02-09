/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotator.tuke.urbansensing.org.resource;

import annotator.tuke.urbansensing.org.DBPediaSpotlightClient;
import annotator.tuke.urbansensing.org.POJO.Corpus;
import annotator.tuke.urbansensing.org.POJO.DBPediaResult;
import annotator.tuke.urbansensing.org.POJO.Ner;
import annotator.tuke.urbansensing.org.POJO.Doc;
import annotator.tuke.urbansensing.org.POJO.Resource;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * REST Web Service
 *
 * @author rodinka
 */
@Path("/annotate")
public class AnnotatorWrapper extends Application {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnnotatorWrapper
     */
    public AnnotatorWrapper() {
    }

    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    public Corpus wrapAnnotationPut(
            Corpus data, @QueryParam(value = "annotator") String annotatorURL
    ) {
        DBPediaSpotlightClient client = new DBPediaSpotlightClient();

        //String response = client.wrapAnnotation(text, url, confidence, support,
        //        types, sparql, policy, conferenceResolution, spotter, disambiguator, annotatorURL);
        //client.close();
        int i = 0;
        if (annotatorURL==null || annotatorURL.equals("")){
            annotatorURL="http://localhost:2222/rest/annotate";
        }
        for (Doc d : data.getDoc()) {
            DBPediaResult response = client.wrapAnnotation(d.getText(), null, null, null,
                    null, null, null, null, null, null, annotatorURL);
            

            for (Resource r : response.getResources()) {

                Ner ner = new Ner();
                for (String t : r.getTypes().split(",")) {
                    ner.setType(t);
                }
                ner.setSubject(r.getSurfaceForm());
                try {
                    ner.setProb(Double.parseDouble(r.getSimilarityScore()));
                } catch (Exception e) {
                }
                data.getDoc().get(i).getNer().add(ner);
            }
            i++;
        }
        
        
        client.close();
        return data;
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String wrapAnnotation(@QueryParam(value = "text") String text,
            @QueryParam(value = "url") String url,
            @QueryParam(value = "confidence") Double confidence,
            @QueryParam(value = "support") Integer support,
            @QueryParam(value = "types") String types,
            @QueryParam(value = "sparql") String sparql,
            @QueryParam(value = "policy") String policy,
            @QueryParam(value = "conferenceResolution") Boolean conferenceResolution,
            @QueryParam(value = "spotter") String spotter,
            @QueryParam(value = "disambiguator") String disambiguator,
            @QueryParam(value = "annotator") String annotatorURL
    ) throws UnsupportedEncodingException, JAXBException, IOException {

        DBPediaSpotlightClient client = new DBPediaSpotlightClient();

        //String response = client.wrapAnnotation(text, url, confidence, support,
        //       types, sparql, policy, conferenceResolution, spotter, disambiguator, annotatorURL);
        DBPediaResult response = client.wrapAnnotation("oil oil daco president", null, null, null,
                null, null, null, null, null, null, "http://localhost:2222/rest/annotate/");
        client.close();

        String result = "";
        for (Resource r : response.getResources()) {
            result = result + "\nURI: " + r.getURI();
            result = result + "\nTYPES: " + r.getTypes();
            result = result + "\n:SURFACE FORM " + r.getSurfaceForm();

        }
        return result;

    }

    @GET
    @Path("/testjson")
    @Produces(MediaType.APPLICATION_JSON)
    public DBPediaResult wrapAnnotation2(@QueryParam(value = "text") String text,
            @QueryParam(value = "url") String url,
            @QueryParam(value = "confidence") Double confidence,
            @QueryParam(value = "support") Integer support,
            @QueryParam(value = "types") String types,
            @QueryParam(value = "sparql") String sparql,
            @QueryParam(value = "policy") String policy,
            @QueryParam(value = "conferenceResolution") Boolean conferenceResolution,
            @QueryParam(value = "spotter") String spotter,
            @QueryParam(value = "disambiguator") String disambiguator,
            @QueryParam(value = "annotator") String annotatorURL
    ) throws UnsupportedEncodingException, JAXBException, IOException {

        DBPediaSpotlightClient client = new DBPediaSpotlightClient();

        //String response = client.wrapAnnotation(text, url, confidence, support,
        //       types, sparql, policy, conferenceResolution, spotter, disambiguator, annotatorURL);
        DBPediaResult response = client.wrapAnnotation("Brazilian oil giant Petrobras and U.S. oilfield service company Halliburton have signed a technological cooperation agreement, Petrobras announced Monday. The two companies agreed on three projects: studies on contamination of fluids in oil wells, laboratory simulation of well production, and research on solidification of salt and carbon dioxide formations, said Petrobras. Twelve other projects are still under negotiation.", null, null, null,
                null, null, null, null, null, null, "http://spotlight.sztaki.hu:2222/rest/annotate/");
        client.close();

        return response;

    }

}
