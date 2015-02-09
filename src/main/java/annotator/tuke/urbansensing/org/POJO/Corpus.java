/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotator.tuke.urbansensing.org.POJO;

import annotator.tuke.urbansensing.org.POJO.Doc;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Corpus {

   
    
    private List<Doc> doc = new ArrayList<Doc>();

    public Corpus(){}
    
    /**
     * 
     * @return
     *     The doc
     */
    public List<Doc> getDoc() {
        return doc;
    }

    /**
     * 
     * @param doc
     *     The doc
     */
    public void setDoc(List<Doc> doc) {
        this.doc = doc;
    }
}
