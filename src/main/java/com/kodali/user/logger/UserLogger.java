package com.kodali.user.logger;


import org.apache.log4j.Logger;

/**
 * 
 * @author kv
 *
 */
public class UserLogger {

    private final static Logger USER_LOGGER = Logger.getLogger("USER_LOGGER");

    public static void warn(String message) {
    	USER_LOGGER.warn(message);
    }

    public static void warn(String message, Throwable t) {
    	USER_LOGGER.warn(message, t);
    }

    public static void error(String message) {
    	USER_LOGGER.error(message);
    }

    public static void error(String message, Throwable t) {
        USER_LOGGER.error(message, t);
    }

    public static void fatal(String message) {
        USER_LOGGER.fatal(message);
    }

    public static void fatal(String message, Throwable t) {
        USER_LOGGER.fatal(message, t);
    }

    public static void info(String message) {
        if (USER_LOGGER.isInfoEnabled()) {
            USER_LOGGER.info(message);
        }
    }

    public static void info(String message, Throwable t) {
        if (USER_LOGGER.isInfoEnabled()) {
            USER_LOGGER.info(message, t);
        }
    }

    public static void debug(String message) {
        if (USER_LOGGER.isDebugEnabled()) {
            USER_LOGGER.debug(message);
        }
    }

    public static void debug(String message, Throwable t) {
        if (USER_LOGGER.isDebugEnabled()) {
            USER_LOGGER.debug(message, t);
        }
    }

}
