
package annotator.tuke.urbansensing.org.POJO;

import java.util.ArrayList;
import java.util.List;



public class Ner {

    
    private String source;
  
    private String subject;
  
    private String context;
   
    private String type;
  
    private String lang;
  
    private Double prob;
  
    private List<Sa> sa = new ArrayList<Sa>();

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The context
     */
    public String getContext() {
        return context;
    }

    /**
     * 
     * @param context
     *     The context
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * 
     * @param lang
     *     The lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * @return
     *     The prob
     */
    public Double getProb() {
        return prob;
    }

    /**
     * 
     * @param prob
     *     The prob
     */
    public void setProb(Double prob) {
        this.prob = prob;
    }

    /**
     * 
     * @return
     *     The sa
     */
    public List<Sa> getSa() {
        return sa;
    }

    /**
     * 
     * @param sa
     *     The sa
     */
    public void setSa(List<Sa> sa) {
        this.sa = sa;
    }

}
