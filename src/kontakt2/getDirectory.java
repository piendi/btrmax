package kontakt2;

import javax.swing.JFileChooser;

/**
 *
 * @author soju
 */
public class getDirectory {
    public String Directory() {
        wähler ordnerwähler = new wähler();
        ordnerwähler.ordnerw.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        ordnerwähler.setVisible(true);
        
        int testwert = ordnerwähler.ordnerw.showOpenDialog(ordnerwähler);
        if(testwert == JFileChooser.APPROVE_OPTION) {
            
            ordnerwähler.setVisible(false);
            String returnpath;
            returnpath = ordnerwähler.ordnerw.getSelectedFile().toString();
            return returnpath;
        }
       
        else
        {
            ordnerwähler.setVisible(false);
            return null;
            
        }
        
    }
}
