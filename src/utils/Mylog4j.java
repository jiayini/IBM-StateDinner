package utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;



public class Mylog4j {
    public static Logger log4j = Logger.getLogger(Mylog4j.class);
    static {

        BasicConfigurator.configure();
        PropertyConfigurator.configure("/Users/jiayin/Desktop/Project_Test_2/log.properties");
//        DOMConfigurator.configure("");
    }


    public static void printInfoLog(String msg) {
       log4j.info(msg);
    }public static void printErrorLog(String msg) {
       log4j.error(msg);
    }public static void printDebugLog(String msg) {
       log4j.debug(msg);
    }
}
