package annotator.tuke.urbansensing.org.POJO;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@XmlRootElement
public class Resource {

 
    private String URI;
  
    private String Support;
 
    
    private String Types;
 
    
    private String SurfaceForm;
  
    
    private String Offset;
   
    
    private String SimilarityScore;
    private String PercentageOfSecondRank;
    
    /**
     * 
     * @return
     *     The URI
     */
@XmlElement(name="@@URI")
    public String getURI() {
        return URI;
    }

    /**
     * 
     * @param URI
     *     The @URI
     */
 
    public void setURI(String URI) {
        this.URI = URI;
    }

    /**
     * 
     * @return
     *     The Support
     */
@XmlElement(name="@@support")
    public String getSupport() {
        return Support;
    }

    /**
     * 
     * @param Support
     *     The @support
     */

    public void setSupport(String Support) {
        this.Support = Support;
    }

    /**
     * 
     * @return
     *     The Types
     */
    @XmlElement(name="@@types")
    public String getTypes() {
        return Types;
    }

    /**
     * 
     * @param Types
     *     The @types
     */
 
    public void setTypes(String Types) {
        this.Types = Types;
    }

    /**
     * 
     * @return
     *     The SurfaceForm
     */
@XmlElement(name="@@surfaceForm")
    public String getSurfaceForm() {
        return SurfaceForm;
    }

    /**
     * 
     * @param SurfaceForm
     *     The @surfaceForm
     */
 
    public void setSurfaceForm(String SurfaceForm) {
        this.SurfaceForm = SurfaceForm;
    }

    /**
     * 
     * @return
     *     The Offset
     */
   @XmlElement(name="@@offset")
    public String getOffset() {
        return Offset;
    }

    /**
     * 
     * @param Offset
     *     The @offset
     */

    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * 
     * @return
     *     The SimilarityScore
     */
@XmlElement(name="@@similarityScore")
    public String getSimilarityScore() {
        return SimilarityScore;
    }

    /**
     * 
     * @param SimilarityScore
     *     The @similarityScore
     */

    public void setSimilarityScore(String SimilarityScore) {
        this.SimilarityScore = SimilarityScore;
    }

    /**
     * 
     * @return
     *     The PercentageOfSecondRank
     */
 @XmlElement(name="@@percentageOfSecondRank")
    public String getPercentageOfSecondRank() {
        return PercentageOfSecondRank;
    }

    /**
     * 
     * @param PercentageOfSecondRank
     *     The @percentageOfSecondRank
     */
  
    public void setPercentageOfSecondRank(String PercentageOfSecondRank) {
        this.PercentageOfSecondRank = PercentageOfSecondRank;
    }

   
}