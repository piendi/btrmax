/*
 * Copyright (C) 2017 soju
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package kontakt2;
import java.io.*;

/**
 *
 * @author soju
 */
public class init {
    public String meta = "";
    public String createConfig() throws IOException {
        String pfad = "config.pimc";
        File file = new File(pfad);
        if (file.exists()) {
            FileReader fr = new FileReader(pfad);
            BufferedReader reader = new BufferedReader(fr);
            String zeile;
            while ((zeile = reader.readLine()) != null) {
                if(zeile.equals("meta_on")) {
                   meta = "1";
                }
             
            }
            fr.close();
            return meta;
            
        }
        else {
            Einrichtung einrichtung = new Einrichtung();
            einrichtung.setVisible(true);
            
            }
        
        return null;
    }
    
}
