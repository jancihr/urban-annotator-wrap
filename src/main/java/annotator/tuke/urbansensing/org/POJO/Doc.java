
package annotator.tuke.urbansensing.org.POJO;

import java.util.ArrayList;
import java.util.List;


public class Doc {

   
    private String text;
   
    private List<Ner> ner = new ArrayList<Ner>();

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The ner
     */
    public List<Ner> getNer() {
        return ner;
    }

    /**
     * 
     * @param ner
     *     The ner
     */
    public void setNer(List<Ner> ner) {
        this.ner = ner;
    }

}
