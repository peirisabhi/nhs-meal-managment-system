/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logger;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author abhi
 */
public class Log {
    
    static final private Logger logger = Logger.getLogger("NHS_Meal_Management_System");

    static {
        FileHandler fh = null;
        try {
            fh = new FileHandler("NHS_Meal_Management_System.log", true);
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.warning(ex.toString());

        }
        logger.addHandler(fh);

        SimpleFormatter f = new SimpleFormatter();
        fh.setFormatter(f);

    }

    public static void warning(Object o) {
        logger.warning(o.toString());
    }

    public static void info(Object o) {
        logger.info(o.toString());
    }

}
