package annotator.tuke.urbansensing.org.POJO;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@Generated("org.jsonschema2pojo")

@XmlRootElement
public class DBPediaResult {



private String Text;

private String Confidence;

private String Support;

private String Types;

private String Sparql;

private String Policy;

private List<Resource> Resources = new ArrayList<Resource>();


public DBPediaResult(){
    
}

/**
* 
* @return
* The Text
*/
@XmlElement(name = "@@text")
public String getText() {
return "@Teeeextikes";
}

/**
* 
* @param Text
* The @text
*/

public void setText(String Text) {
this.Text = Text;
}

/**
* 
* @return
* The Confidence
*/
@XmlElement(name ="@@confidence")
public String getConfidence() {
return Confidence;
}

/**
* 
* @param Confidence
* The @confidence
*/

public void setConfidence(String Confidence) {
this.Confidence = Confidence;
}

/**
* 
* @return
* The Support
*/
@XmlElement(name ="@@support")
public String getSupport() {
return Support;
}

/**
* 
* @param Support
* The @support
*/

public void setSupport(String Support) {
this.Support = Support;
}

/**
* 
* @return
* The Types
*/
@XmlElement(name ="@@types")
public String getTypes() {
return Types;
}

/**
* 
* @param Types
* The @types
*/

public void setTypes(String Types) {
this.Types = Types;
}

/**
* 
* @return
* The Sparql
*/
@XmlElement(name ="@@sparql")
public String getSparql() {
return Sparql;
}

/**
* 
* @param Sparql
* The @sparql
*/

public void setSparql(String Sparql) {
this.Sparql = Sparql;
}

/**
* 
* @return
* The Policy
*/
@XmlElement(name ="@@policy")
public String getPolicy() {
return Policy;
}

/**
* 
* @param Policy
* The @policy
*/

public void setPolicy(String Policy) {
this.Policy = Policy;
}

/**
* 
* @return
* The Resources
*/
@XmlElement(name = "Resources")
public List<Resource> getResources() {
return Resources;
}

/**
* 
* @param Resources
* The Resources
*/

public void setResources(List<Resource> Resources) {
this.Resources = Resources;
}




}