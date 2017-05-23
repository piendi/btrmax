/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontakt2;

import java.io.IOException;

/**
 *
 * @author soju
 */
public class Kontakt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        init start = new init();
        start.createConfig();
        MAIN mainGUI = new MAIN();
        mainGUI.setVisible(true);
    }
    
}
