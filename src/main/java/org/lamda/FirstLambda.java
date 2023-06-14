package org.lamda;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FirstLambda {

    public String handleRequest(){

        Logger logger = Logger.getLogger(FirstLambda.class.getName());
        logger.log(Level.INFO, "Test AWS Lambda log message");

        return "Hello, AWS Lambda";
    }
}
