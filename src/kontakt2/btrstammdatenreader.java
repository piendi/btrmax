package kontakt2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author soju
 */
public class btrstammdatenreader {
    public String[] stammdaten() throws FileNotFoundException, IOException {
    FileReader fr = new FileReader("config.pimc");
    BufferedReader br = new BufferedReader(fr);
    String zeile;
    while((zeile = br.readLine()) != null) {
        if(zeile.indexOf("<std_conf>") != -1) {
            String strddata[] = zeile.split(";");
            return strddata;
        }
    }
    
    return null;
    
    
}
    
}
